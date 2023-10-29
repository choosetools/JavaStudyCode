package org.example.javaadvanced;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName: ObjectOrientedBasicTest
 * @Package: org.example.javaadvance
 * @Author cheng
 * @Create 2023/10/29 20:07
 * @Description: 面向对象基础练习
 */
public class ObjectOrientedBasicTest {
    @Test
    public void circleTest(){
        CircleGraph c1 = new CircleGraph();
        CircleGraph c2 = new CircleGraph();
        c1.radius = 1.2;
        c2.radius = 5.5;

        System.out.println(c1);
        System.out.println(c2);

    }

    @Test
    public void myIntTest(){
        MyInt myInt = new MyInt(12);
        System.out.println(myInt.isNatural);
        System.out.println(myInt.approximateNumberCount());
        System.out.println(myInt.isPrimeNumber());
        System.out.println(Arrays.toString(myInt.getAllPrimeNumber()));
    }

    @Test
    public void myDateTest(){
        MyDate myDate = new MyDate(2000, 1, 10);
        System.out.println(myDate);

        myDate.puls(4, 2, 1000);
        System.out.println(myDate);
    }
}
class CircleGraph{
    double radius;

    double getCircumference(){
        return 2 * this.radius * Math.PI;
    }

    double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "圆的半径为：" + this.radius + "，其周长为" + this.getCircumference() + "，面积为：" + this.getArea();
    }
}

class MyInt{
    private int value;
    boolean isNatural;

    MyInt(int value){
        this.value = value;
        if (value >= 0){
            this.isNatural = true;
        }
    }

    int approximateNumberCount(){
        if (this.value < 1){
            return 0;
        }
        int approximateNumberCount = 0;
        for (int i = 1; i <= this.value; i++) {
            if (value % i == 0){
                approximateNumberCount++;
            }
        }
        return approximateNumberCount;
    }

    boolean isPrimeNumber(){
        return approximateNumberCount() == 2;
    }

    int[] getAllPrimeNumber(){
        int approximateNumberCount = approximateNumberCount();
        int[] primes = new int[approximateNumberCount];
        if (approximateNumberCount == 0){
            return primes;
        }
        int index = 0;
        for (int i = 1; i <= this.value; i++) {
            if (this.value % i == 0){
                primes[index] = i;
                index++;
            }
        }
        return primes;
    }

}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws Exception{
        if (month > 12 || month < 1){
            throw new Exception("月份有误，请重新输入");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws Exception {
        if (day > 31 || day < 1){
            throw new Exception("日期有误，请重新输入");
        }
        this.day = day;
    }

    boolean isLeapYear(){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    //判断输入的年是否是闰年，是返回1，否返回0
    int isLeapYearOrNot(){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1:0;
    }
    void set(int year, int month, int day) throws Exception{
        if (month > 12 || month < 1 || day < 1 || day > 31){
            throw new Exception("输入日期信息有误，请重新输入");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //当前时间加上years年，months月，days后的日期，显示为年月日
    void puls(int years, int month, int days){
        this.year += years;
        this.month += month;
        if (month > 12){
            monthToAdult(this.month);
        }
        this.day += days;
        if (this.day > 1826){
            this.year += (this.day / 1826);
            this.day %= 1826;
        }
        //先去判断当前日是否是直接大于365或者366（平年与闰年的区别），这样可以有效减少后续循环的次数
        while (true) {
            int leapYearOrNot = isLeapYearOrNot();
            switch (leapYearOrNot){
                case 1:
                    if (this.day >= 366){
                        this.year++;
                        this.day -= 366;
                    }
                    break;
                case 0:
                    if (this.day >= 355){
                        this.year++;
                        this.day -= 355;
                    }
            }
            if (leapYearOrNot == 1 && this.day < 366){
                break;
            }else if (this.day < 365){
                break;
            }
        }


        //能不能直接用月来考虑日期的变化？
        while (true){
            if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10){
                if (day > 31) {
                    this.day -= 31;
                    this.month++;
                }else {
                    break;
                }
            }else if (this.month == 2){
                boolean leapYear = isLeapYear();
                if (leapYear){
                    if (this.day > 29){
                        this.day -= 29;
                        this.month++;
                    }else {
                        break;
                    }
                }else {
                    if (this.day > 28){
                        this.day -= 28;
                        this.month++;
                    }else {
                        break;
                    }
                }

            }else if (this.month == 12){
                //12需要重新考虑
                if (this.day > 31){
                    this.day -= 31;
                    this.month = 1;
                    this.year++;
                }else {
                    break;
                }
            }else {
                if (this.day > 30){
                    this.day -= 30;
                    this.month++;
                }else {
                    break;
                }
            }

        }

    }

    private void monthToAdult(int month){
        int year = month / 12;
        this.year += year;
        this.month = month % 12;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
