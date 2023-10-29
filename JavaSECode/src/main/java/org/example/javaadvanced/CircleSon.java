package org.example.javaadvanced;

import org.example.javabasics.Circle2;
import org.junit.Test;

/**
 * @ClassName: CircleSon
 * @Package: org.example.javaadvance
 * @Author cheng
 * @Create 2023/10/27 22:12
 * @Description: TODO
 */
public class CircleSon extends Circle2 {
    @Test
    public void test(){

    }
}
class Student{
    public static Student student;
   String name;

   int age;

   String school;

   String major;

   private Student(){
   }

   public static Student getStudent(){
       student = new Student();
       return student;
   }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }
}
