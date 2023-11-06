package org.example.javaadvanced;

import org.example.javabasics.SubClass;
import org.example.javabasics.SubClass4;
import org.example.testpack.SubClass5;
import org.junit.Test;

/**
 * @ClassName: TestSuper
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 10:55
 * @Description:
 */
public class TestSuper{
    @Test
    public void test(){
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.supDefault);
//        System.out.println(superClass.supProtected);
        System.out.println(superClass.supPublic);


        SubClass subClass = new SubClass();
        System.out.println(subClass.subPublic);

        //该类与父类是同一个包
//        System.out.println(subClass.supProtected);
        System.out.println(subClass.supPublic);












        System.out.println(SuperClass.supStaticDef);
        System.out.println(SuperClass.supStaticPro);
        System.out.println(SuperClass.supStaticPub);


        System.out.println(SubClass.supStaticPro);
        System.out.println(SubClass.supStaticPub);
        System.out.println(SubClass.subStaticPub);

    }

    @Test
    public void test2(){
        SubClass2 subClass2 = new SubClass2();
        System.out.println(subClass2.supDefault);
    }


    @Test
    public void test3(){
        SubClass2 subClass2 = new SubClass2();
        //与父类和子类均在同一个包下，且当前类与其在同一个包中，那么两个类中的缺省属性均可以访问
        System.out.println(subClass2.supDefault);

        //父类与子类均在同一个包下，但当前类与其不在同一个包中，则无法去访问子类或父类中的缺省属性
        SubClass4 subClass4 = new SubClass4();
//        System.out.println(subClass4.supDefault);报错，无法访问

        //与父类在同一个包下，但是与子类不在同一个包下，无法通过子类去调用父类中的缺省属性
        SubClass subClass = new SubClass();
//        System.out.println(subClass.supDefault);报错，无法访问

        //与子类在同一个包下，但是与父类不在同一个包下，无法通过子类去调用父类中的缺省属性
        SubClass3 subClass3 = new SubClass3();
//        System.out.println(subClass3.supDefault);报错，无法访问

    }

    @Test
    public void test4(){
        //子类、父类与当前类均在一个包中
        SubClass2 s1 = new SubClass2();
        System.out.println(s1.supProtected);

        //父类与子类在一个包中，当前类不与其在同一个包中
        SubClass4 s2 = new SubClass4();
//        System.out.println(s2.supProtected);报错

        //当前类与父类在同一个包中，但是与子类不在同一个包中
        //此时无法访问到子类中的protected属性
        //但是可以通过子类去访问到父类中的protected属性
        SubClass s3 = new SubClass();
        System.out.println(s3.supProtected);


        //当前与子类在同一个包中，但是与父类不在同一个包中
        //此时可以访问到子类中的protected属性
        //但是无法访问到父类中的protected属性
        SubClass3 s4 = new SubClass3();
//        System.out.println(s4.supProtected);


        //当前类、子类、父类均不在同一个包中
        SubClass5 s5 = new SubClass5();
//        System.out.println(s5.supProtected);报错
    }
}
