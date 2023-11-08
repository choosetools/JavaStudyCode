package org.example.testpack;

/**
 * @Author cheng
 * @ClassName Student
 * @Date 2023/11/8 9:31
 * @Version V1.0
 * @Description
 */
public class Student extends Person{
//    public int age = 2;
    @Override
    public void method(){
        System.out.println("Student类中的method()方法");
    }

    public void study(){
        System.out.println("学生要进行学习");
    }

    public void exercise(){
        System.out.println("学生也要运动");
    }
}
