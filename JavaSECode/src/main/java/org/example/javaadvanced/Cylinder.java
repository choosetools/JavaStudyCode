package org.example.javaadvanced;

/**
 * @ClassName: Cylinder
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 10:36
 * @Description: TODO
 */
public class Cylinder extends Circle {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Cylinder() {
        this.length = 1.0;
    }

    public double findVolume() {
        return findArea() * this.length;
    }
}
