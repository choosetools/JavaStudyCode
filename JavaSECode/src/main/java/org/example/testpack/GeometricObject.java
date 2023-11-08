package org.example.testpack;

/**
 * @ClassName: GeometricObject
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/8 19:23
 * @Description: 几何形状类
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();
}
