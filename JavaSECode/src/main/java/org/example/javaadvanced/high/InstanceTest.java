//package org.example.javaadvanced.high;
//
///**
// * @ClassName: InstanceTest
// * @Package: org.example.javaadvanced.high
// * @Author cheng
// * @Create 2023/11/8 20:02
// * @Description: TODO
// */
//public class InstanceTest {
//    public void method(Person e){
//        System.out.println(e.getInfo());
//        if (e instanceof Graduate){
//            System.out.println("a graduated student");
//        }
//        if (e instanceof Student){
//            System.out.println("a student");
//        }
//        System.out.println("a person");
//    }
//
//    public static void main(String[] args) {
//        InstanceTest test = new InstanceTest();
//        test.method(new Graduate());
//
//    }
//}
//class Person {
//    protected String name="person";
//    protected int age=50;
//    public String getInfo() {
//        return "Name: "+ name + "\n" +"age: "+ age;
//    }
//}
//class Student extends Person {
//    protected String school="pku";
//    public String getInfo() {
//        return  "Name: "+ name + "\nage: "+ age
//                + "\nschool: "+ school;
//    }
//}
//class Graduate extends Student{
//    public String major="IT";
//    public String getInfo()
//    {
//        return  "Name: "+ name + "\nage: "+ age
//                + "\nschool: "+ school+"\nmajor:"+major;
//    }
//}