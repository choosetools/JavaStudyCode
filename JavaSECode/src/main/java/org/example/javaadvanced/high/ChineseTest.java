//package org.example.javaadvanced.high;
//
///**
// * @ClassName: ChineseTest
// * @Package: org.example.javaadvanced.high
// * @Author cheng
// * @Create 2023/11/11 12:15
// * @Description: TODO
// */
//public class ChineseTest {
//    public static void main(String[] args) {
//        //实例变量都是属于每个对象，每个对象都会有一份，彼此之间互不影响
//        Chinese c1 = new Chinese();
//        c1.name = "姚明";
//        c1.age = 40;
//        Chinese.nation = "China";
//
//        Chinese c2 = new Chinese();
//        c2.name = "刘翔";
//        c2.age = 39;
//
//        System.out.println(c1);
//        System.out.println(c2);
//
//        System.out.println(Chinese.nation);
//    }
//}
//class Chinese{
//    String name;
//    int age;
//
//    //静态变量，也叫作类变量
//    static String nation;
//
//    @Override
//    public String toString() {
//        return "Chinese{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public static void method(){
//        nation = "jiangxi";
//        System.out.println("Chinese中的静态method()方法");
//    }
//}
//
//class JiangXi extends Chinese{
//    public static void method(){
//
//    }
//}
