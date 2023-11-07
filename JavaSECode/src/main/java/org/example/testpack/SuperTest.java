package org.example.testpack;

import org.junit.Test;

/**
 * @Author cheng
 * @ClassName SuperTest
 * @Date 2023/11/7 9:29
 * @Version V1.0
 * @Description
 */
public class SuperTest {
    @Test
    public void test(){
        Son son  = new Son();

    }
}
class Parent{
    int age;

    public Parent(int age){
        this.age = age;
    }

    public Parent(){
        System.out.println("父类中的无参构造器");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Son extends Parent{
    int age;

    public Son(){
        //先去调用父类中的无参构造器
        System.out.println("son类中的无参构造器");
    }


    public Son(int age){

        super(age);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}