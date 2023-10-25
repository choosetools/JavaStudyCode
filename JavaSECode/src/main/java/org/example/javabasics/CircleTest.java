package org.example.javabasics;

import java.math.BigDecimal;

/**
 * @ClassName: CircleTest
 * @Package: org.example
 * @Author cheng
 * @Create 2023/10/25 18:57
 * @Description: java面向对象基础测试2：设计类计算园的面积
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(15.5);
        BigDecimal area = circle.getArea();
        System.out.println(area);
    }
}
class Circle{
    private double radius;

    private BigDecimal area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //计算圆的面积
    public BigDecimal getArea(){
        BigDecimal r = new BigDecimal(String.valueOf(this.radius));
        BigDecimal p = new BigDecimal(String.valueOf(Math.PI));

        area = p.multiply(r).multiply(r);
        area = area.setScale(2, BigDecimal.ROUND_HALF_UP);
        return this.area;
    }
}
