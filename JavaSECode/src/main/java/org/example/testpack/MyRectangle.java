package org.example.testpack;

/**
 * @ClassName: MyRectangle
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/8 19:35
 * @Description: TODO
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight){
        super(color, weight);
        this.width = width;
        this.height = height;
    }
    @Override
    public double findArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
