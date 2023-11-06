package org.example.javaadvanced;

/**
 * @ClassName: Circle
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 10:36
 * @Description: TODO
 */
public class Circle {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return this.radius * this.radius * Math.PI;
    }
}
