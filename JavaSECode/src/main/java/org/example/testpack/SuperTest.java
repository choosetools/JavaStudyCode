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
        //这里调用的属性是父类中的属性
//        son.test();
        //这里调用的方法却是子类中重写的方法
        son.print();
    }
}
class Parent{
//    private String name = "Parent";
//    public String getName() {
//        return name;
//    }

    public void method(){
        System.out.println("父类中的method方法");
    }

    public void print(){
        method();
    }
}
class Son extends Parent{
//    private String name = "Son";


    public void method(){
        System.out.println("子类中的method方法");
    }

//    public void test(){
//        //这里的getName()继承自Parent类中
//        //由于Son类中没有getName()，那么会去父类中查找
//        //找到了，返回的name根据就近原则，返回的实际上是父类中的name属性
//        System.out.println(this.getName());
//        System.out.println(super.getName());
//    }
}