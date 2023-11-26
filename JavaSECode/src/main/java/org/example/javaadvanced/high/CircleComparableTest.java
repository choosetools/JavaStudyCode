package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: CompareObject
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/25 22:32
 * @Description: TODO
 */
interface CompareObject {
    //若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小
    public abstract int compareTo(Object o);
}

class Circle{
   private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double radius) {
        this.setRadius(radius);
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        return Double.compare(this.getRadius(), circle.getRadius());
    }
}
public class CircleComparableTest{
    @Test
    public void test(){
        ComparableCircle c1 = new ComparableCircle(11);
        ComparableCircle c2 = new ComparableCircle(11);
        System.out.println(c1.compareTo(c2));
    }
}
