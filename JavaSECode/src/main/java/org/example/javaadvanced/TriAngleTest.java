package org.example.javaadvanced;

/**
 * @ClassName: TriAngleTest
 * @Package: org.example.javaadvance
 * @Author cheng
 * @Create 2023/10/29 11:02
 * @Description: TODO
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(14.5, 11.3);
        System.out.println("三角形面积为：" + triAngle.getBase() * triAngle.getBase() / 2);
    }
}
class TriAngle{
    private double base;//底边长
    private double height;//高

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}
