//package org.example.javaadvanced.high;
//
//import org.junit.Test;
//
///**
// * @ClassName: StaticMethodTest
// * @Package: org.example.javaadvanced.high
// * @Author cheng
// * @Create 2023/11/11 14:08
// * @Description: TODO
// */
//public class StaticMethodTest {
//    @Test
//    public void test(){
//        Father.staticMethod();
//        Child.staticMethod();
//
//        System.out.println(Father.age);
//        System.out.println(Child.age);
//
//        Father father = new Child();
//        father.staticMethod2();
//    }
//}
//class Father{
//    public static int age = 1;
//    public static void staticMethod(){
//        System.out.println("fatherMethod!");
//    }
//
//    public static void staticMethod2(){
//        System.out.println("父类中的staticMethod2方法！");
//    }
//
//}
//class Child extends Father{
//    public static void staticMethod2(){
//        System.out.println("子类中的staticMethod2方法！");
//    }
//}