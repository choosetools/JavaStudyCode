package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: MemberInnerClassTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/26 19:39
 * @Description: 成员内部类测试
 */
public class MemberInnerClassTest {
    @Test
    public void test(){
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInnerInstance();

    }
}
class Outer{
    private int outerVariable = 1;
    private int commonVariable = 2;
    private static int outerStaticVariable = 3;


    /**
     * 成员方法
     */
    public void outerMethod() {
        System.out.println("我是外部类的outerMethod方法");
    }

    /**
     * 静态方法
     */
    public static void outerStaticMethod() {
        System.out.println("我是外部类的outerStaticMethod静态方法");
    }

    public Outer(){}

    public void method(){}

    public Inner getInnerInstance(){
        return new Inner();
    }

    class Inner{

        public static int innerStaticVariable = 1;
        private int commonVariable = 20;
        public Inner(){
            outStaticShow();
        }


        /**
         * 成员方法，访问外部类信息（属性、方法）
         */
        public void innerShow() {
            //当和外部类冲突时，直接引用属性名，是内部类的成员属性
            System.out.println("内部的commonVariable:" + commonVariable);

            //内部类访问外部属性
            System.out.println("outerVariable:" + outerVariable);

            //当和外部类属性名重叠时，可通过外部类名.this.属性名的方式进行调用
            System.out.println("外部的commonVariable:" + Outer.this.commonVariable);
            System.out.println("outerStaticVariable:" + outerStaticVariable);

            //访问外部类的方法
            outerMethod();
            outerStaticMethod();

            //同理，当外部类方法名与内部类方法名重名时
            //在内部类中直接使用方法名的方式调用的是内部类中的方法
            //使用外部类名.this.method()的方式调用外部类同名的方法
            method();
            Outer.this.method();
        }

        public static void innerStaticMethod(){
        }
    }
    public void outerShow(){
        //如果在外部类中想要调用内部类中的成员属性或方法，需要使用内部类对象调用
        Inner inner = new Inner();
        inner.innerShow();
        //对于静态的方法或属性直接使用内部类调用
        Inner.innerStaticMethod();
    }

    public static void outStaticShow(){

    }
}
