package org.example.testpack;

import org.junit.Test;

/**
 * @ClassName: GeometricTest
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/8 19:37
 * @Description: TODO
 */
public class GeometricTest {
    public boolean equalsArea(GeometricObject o1, GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public double displayGeometricObject(GeometricObject o){
        return o.findArea();
    }

    @Test
    public void test(){
        GeometricObject o1 = new MyRectangle(10, 12, "red", 1);
        GeometricObject o2 = new Circle(8, "yellow", 2);
        GeometricTest test = new GeometricTest();
        System.out.println(test.displayGeometricObject(o1));
        System.out.println(test.displayGeometricObject(o2));
    }
}
