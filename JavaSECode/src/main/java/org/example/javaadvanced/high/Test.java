package org.example.javaadvanced.high;

/**
 * @ClassName: Test
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/26 10:59
 * @Description: TODO
 */
public class Test {
    @org.junit.Test
    public void test(){
        S1 s = new S1();
        s.method();
    }
}
class S1 extends F1{
    @Override
    public void method(){
        super.method();
    }
}
class F1{
    public void method(){
        System.out.println("父类中的方法");
    }
}
