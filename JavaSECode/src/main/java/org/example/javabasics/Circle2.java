package org.example.javabasics;

import org.junit.Test;

import java.util.Date;

/**
 * @Author cheng
 * @ClassName Circle2
 * @Date 2023/10/26 11:05
 * @Version V1.0
 * @Description
 */
public class Circle2 {
    private int privateProperty;
    int defaultProperty;
    protected int protectedProperty;
    public int publicProperty;
    public static void main(String[] args) {
//        PassObject passObject = new PassObject();
//        passObject.printAreas(new Circle2(), 8);
//    }
//    double radius;
//    public double findArea(double radius){
//        return radius * radius * Math.PI;

        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println(a);
        System.out.println(b);
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(10000L);
    }

    public static void method(int ... nums){
        nums[0] *= 10;
        nums[1] *= 20;
    }
    public void publicMethod(){}

    protected void protectedMethod(){}

    private void privateMethod(){}

    void defaultMethod(){}
}
class Circle2Test{
    @Test
    public void test(){
        Circle2 circle2 = new Circle2();

    }
}

//class PassObject{
//    public void printAreas(Circle2 circle2, int time){
//        for (int i = 1; i <= time; i++) {
//            System.out.println(i + " " + circle2.findArea(i));
//        }
//    }
//}
