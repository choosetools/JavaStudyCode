package org.example;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName: DateTimeTest
 * @Package: org.example
 * @Author cheng
 * @Create 2023/12/20 16:49
 * @Description: TODO
 */
public class DateTimeTest {
    /**
     * 有两个Date类：
     * java.util.Date
     *       java.sql.Date
     * 其中：java.sql.Date是java.util.Date的子类
     *
     */
    @Test
    public void test(){
        //创建一个基于当前系统时间的Date实例
        Date date1 = new Date();
        //创建一个制定时间戳的Date实例
        Date date2 = new Date(1503066032874L);
        //getTime()用于返回date表示的时间距离1970.1.1 00:00:00的时间差
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        //将Date转换成 dow mon dd hh:mm:ss zzz yyy形式的字符串
        System.out.println(date1);
        System.out.println(date2);
    }

    @Test
    public void test2(){
        java.sql.Date date = new java.sql.Date(1703066099457L);
        System.out.println(date);
        System.out.println(date.getTime());
    }

    @Test
    public void test3(){
        //使用默认的模式和语言环境创建对象，这个时候的格式是默认的
        Date date = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat();
        System.out.println(s1.format(date));

        //创建指定格式的SimpleDateFormat对象
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy/MM/dd ah:mm");
        System.out.println(s2.format(date));

        Date date2;
        try {
            //将指定格式的字符串转换成Date类型
            date2 = s1.parse("2023/11/05 下午3:12");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date2);
    }

    /**
     * Calendar日历类
     * 1、实例化：由于Calendar是一个抽象类，所以我们需要创建其子类的实例，这里我们通过Calendar的静态方法getInstance()即可获取
     *
     */
    @Test
    public void test4(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        //GregorianCalendar calendar = new GregorianCalendar();

        //get()方法
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //set()方法
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


        //add(int field, xx)
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime()方法获取Date类对象
        // Calendar -> Date
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());

        //setTime()：将calendar设置成指定date时间的日历对象
        Date date1 = new Date(1303162293363L);
        calendar.setTime(date1);

    }

    @Test
    public void test6(){
        Scanner scanner = new Scanner(System.in);
        //年
        int month;
        int day;
        System.out.print("请输入年：");
        int year = scanner.nextInt();

        while (true){
            System.out.printf("请输入月：");
            month = scanner.nextInt();
            if (month < 0 || month > 12){
                System.out.println("信息有误，请重新输入！");
            }else {
                break;
            }
        }
        while (true){
            System.out.printf("请输入日：");
            day = scanner.nextInt();
            if (day < 0 || day > 31){
                System.out.println("信息有误，请重新输入！");
            }else {
                break;
            }
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(year + "-" + month + "-" + day);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);

    }

    @Test
    public void test7(){
        //创建一个Scanner对象，用于获取用户输入
        Scanner scanner = new Scanner(System.in);
        //提示用户输入年份
        System.out.print("请输入年份：");
        int year = scanner.nextInt();
        int month;
        //循环获取用户输入的月份
        while (true){
            System.out.printf("请输入月份：");
            month = scanner.nextInt();
            //判断用户输入的月份是否在1到12之间
            if (month < 0 || month > 12){
                System.out.println("信息有误，请重新输入！");
            }else {
                break;
            }
        }

        //判断当前月是否是2月，是2月要考虑是否是闰年
        //计算出那个月的1号是星期几
        //先获取到Date类型，再转换成Calendar类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(year + "-" + month + "-" + "01");
        } catch (ParseException e) {
            scanner.close();
            throw new RuntimeException(e);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println();
        System.out.println("日	一	二	三	四	五	六");
        int columnCount = 0;
        //每个月的天数
        int numberOfDaysInMonth;
        //打印出当前月份的1号是星期几
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print(" 	");
            columnCount++;
        }

        //根据月份判断当前月份的天数
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            numberOfDaysInMonth = 31;
        }else if (month == 2){
            //计算当前年是否为闰年
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                numberOfDaysInMonth = 29;
            }else {
                numberOfDaysInMonth = 28;
            }
        }else {
            numberOfDaysInMonth = 30;
        }
        //打印出当前月份的天数
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.print(i + "	");
            columnCount++;
            //每7个元素换行
            if (columnCount == 7){
                columnCount = 0;
                System.out.println();
            }
        }
    }


    /**
     * LocalDate、LocalTime、LocalDateTime
     */
    @Test
    public void test8(){
        LocalDate ld1 = LocalDate.now();
        LocalTime lt1 = LocalTime.now();
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ld1);
        System.out.println(lt1);
        System.out.println(ldt1);

        LocalDate ld2 = LocalDate.of(2023, 12, 20);
        System.out.println(ld2);
        LocalTime lt2 = LocalTime.of(14, 35, 12);
        System.out.println(lt2);

        System.out.println(ld1.getDayOfMonth());
        //这里就体现了不可变性
        LocalDateTime ldt3 = ldt1.withDayOfMonth(30);
        System.out.println(ldt3);//2023-12-30T22:53:45.135047600

        //加上5日
        LocalDate ld3 = ld1.plusDays(5);
        System.out.println(ld3);//2023-12-25


    }

    @Test
    public void test10(){

    }

    @Test
    public void test9(){
        Instant instant1 = Instant.now();
        System.out.println(instant1);//2023-12-20T15:14:55.795734800Z
        System.out.println(instant1.toEpochMilli());//1703085295795

        //转换成UTC+8时区
        OffsetDateTime odt = instant1.atOffset(ZoneOffset.ofHours(8));
        LocalDateTime localDateTime = odt.toLocalDateTime();
        System.out.println(localDateTime);//2023-12-20T23:14:55.795734800
    }



}
