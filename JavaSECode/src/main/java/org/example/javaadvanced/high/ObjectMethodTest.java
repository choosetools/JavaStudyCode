package org.example.javaadvanced.high;

import org.example.javaadvanced.Boy;
import org.junit.Test;

/**
 * @ClassName: ObjectMethodTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/9 16:15
 * @Description: TODO
 */
public class ObjectMethodTest {
    public static void main(String[] args) {
//        CloneTest c1 = new CloneTest("cheng");
//        CloneTest c2;
//        try {
//            c2 = c1.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(c1);
//        System.out.println(c2);
//
//        System.out.println(c1 == c2);
//        System.out.println(c1.equals(c2));
//
//
//        System.out.println(c1.getName());
//        System.out.println(c2.getName());
    }

    @Test
    public void test() throws CloneNotSupportedException {
        Boy boy = new Boy("jia", 23);
        CloneTest c1 = new CloneTest("cheng", boy);
        CloneTest c2 = c1.clone();


        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getBoy() == c2.getBoy());
    }

    @Test
    public void test2(){
        Bag bag = new Bag("我的小书包");

        Student s1 = new Student("cheng", bag);
        Student s2 = s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

        Bag b1 = s1.getBag();
        Bag b2 = s2.getBag();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}
