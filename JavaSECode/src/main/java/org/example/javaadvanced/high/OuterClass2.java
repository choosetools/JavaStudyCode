package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: OuterClass
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/27 17:30
 * @Description: TODO
 */
public class OuterClass2 {
    @Test
    public void test(){
        OuterClass2.method();
    }
    public class InnerClass{
        public static Integer a = 1;
        public static void method(){

        }
        private int age = 2;

        public void method2(){
            OuterClass2.method();
        }
    }

    public int age = 1;
    public static void method(){
        OuterClass2 outerClass2 = new OuterClass2();
        InnerClass innerClass = outerClass2.new InnerClass();
        System.out.println(innerClass.age);
    }
}
