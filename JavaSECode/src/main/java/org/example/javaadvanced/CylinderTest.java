package org.example.javaadvanced;

import org.junit.Test;

/**
 * @ClassName: CylinderTest
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 10:39
 * @Description: TODO
 */
public class CylinderTest {
    @Test
    public void test() {
         Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getLength());
        System.out.println(cylinder.getRadius());
        cylinder.setRadius(3);
        cylinder.setLength(5);
        System.out.println(cylinder.findVolume());
        System.out.println(cylinder.findArea());
    }
}
