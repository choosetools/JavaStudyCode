package org.example.testpack;

/**
 * @ClassName: Circle
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/8 19:30
 * @Description: TODO
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }
    @Override
    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
