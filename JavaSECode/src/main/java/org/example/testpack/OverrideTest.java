package org.example.testpack;

/**
 * @ClassName: OverrideTest
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/6 20:59
 * @Description: TODO
 */
public class OverrideTest {
}

abstract class ParentClass {
    public void method(String name){
        System.out.println("父类中的method方法");
    }

    public void method(String name, int age){

    }
}
class SonClass extends ParentClass{

    @Override
    public void method(String name, int age){
        System.out.println("子类中的method方法");
    }
}