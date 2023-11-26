package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: InterfaceTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/23 1:22
 * @Description: TODO
 */
public class InterfaceTest {
    @Test
    public void test(){
        Flyable flyable = new Plane();
        flyable.method1();
        flyable.method2();
        flyable.method3();

    }
}
interface Flyable {
    //公共的静态常量，public static final可以省略
    public static final int MIN_SPEED = 0;
    int MAX_SPEED = 8000;

    //公共的抽象方法，public abstract可以省略
    public abstract void method1();
    void method2();

    //公共的默认方法
    public default void method3(){
        System.out.println("接口中的默认方法method3()");
    }

    //公共的静态方法
    public static void method4(){
        System.out.println("接口中的静态方法method4()");
    }

    //私有方法
    private void method5(){
        System.out.println("接口中的私有方法method5()");
    }
}
class Plane implements Flyable{

    @Override
    public void method1() {
        System.out.println("实现类中的method1()");
    }

    @Override
    public void method2() {
        System.out.println("实现类中的method2()");
    }
}
interface F2 extends Cloneable, Flyable{
    public abstract void F2method1();
}
class ClassTest2 implements F2{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void F2method1() {

    }
}