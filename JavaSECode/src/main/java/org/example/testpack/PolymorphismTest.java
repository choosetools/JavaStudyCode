package org.example.testpack;

import org.junit.Test;

/**
 * @Author cheng
 * @ClassName PolymorphismTest
 * @Date 2023/11/8 9:35
 * @Version V1.0
 * @Description 多态性测试
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        Person person = new Student();
        //这里调用的是子类中重写的的getAge()方法
        //根据就近原则，返回的值是Student类中的age属性
        System.out.println(person.getAge());

        //
        System.out.println(person.age);
    }

    @Test
    public void test(){
        Student student = new Student();
        System.out.println(student.getAge());
    }
}
