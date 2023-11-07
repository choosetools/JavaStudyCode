package org.example.javaadvanced;

import org.junit.Test;

/**
 * @Author cheng
 * @ClassName ExtendsClass
 * @Date 2023/10/31 10:18
 * @Version V1.0
 * @Description
 */
public class ExtendsClass extends ExtendsClassTest {
    @Test
    public void test() {
        new Student1().fun();
    }
}


class Person1 {
    private String name = "wanghan";

    private void print() {
        System.out.println("执行的是父类中的方法！");
    }

    public void fun() {
        print();
        System.out.println(this.name);
    }
}

class Student1 extends Person1 {
    void print() {
        System.out.println("执行的是子类中的方法！");
    }
}

