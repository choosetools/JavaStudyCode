package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @Author cheng
 * @ClassName AbstractTest
 * @Date 2023/11/19 21:12
 * @Version V1.0
 * @Description
 */
public class AbstractTest {
    @Test
    public void test(){
        AbstractFather abstractFather = new AbstractFather(){
            private int age;

            public int getAge() {
                return age;
            }
            @Override
          public void method(){
              System.out.println("子类中的method方法");
          }
        };
        abstractFather.method();
//        abstractFather.getAge();报错
    }
}
class AbstractFather{
    public void method(){
        System.out.println("父类中的method方法");
    }
}
//class Son extends AbstractFather{
//
//    @Override
//    public void method() {
//        System.out.println("子类中的method方法");
//    }
//}
//
