package org.example.javaadvanced.high;

/**
 * @ClassName: StaticTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/11 11:37
 * @Description: TODO
 */
public class StaticTest {

    public static void main(String[] args) {
        StaticTest staticTest = null;
        staticTest.hello();
        System.out.println(staticTest.age);
    }


    public static int age = 1;

    public static void hello(){
        System.out.println("hello!");
    }
}
