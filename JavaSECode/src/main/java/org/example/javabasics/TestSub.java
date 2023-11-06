package org.example.javabasics;

import org.example.javaadvanced.SubClass2;
import org.example.javaadvanced.SuperClass;
import org.junit.Test;

/**
 * @ClassName:
 * @Package: org.example.javabasics
 * @Author cheng
 * @Create 2023/11/5 10:56
 * @Description:
 */
public class TestSub extends SuperClass{
    @Test
    public void test(){
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.supPublic);


        SubClass subClass = new SubClass();
        System.out.println(subClass.subDefault);
        System.out.println(subClass.subProtected);
        System.out.println(subClass.subPublic);

        //因为当前类与父类不属于同一个类
        System.out.println(subClass.supPublic);













        System.out.println(SuperClass.supStaticPro);
        System.out.println(SuperClass.supStaticPub);


        System.out.println(SubClass.supStaticPro);
        System.out.println(SubClass.supStaticPub);
        System.out.println(SubClass.subStaticDef);
        System.out.println(SubClass.subStaticPro);
        System.out.println(SubClass.subStaticPub);

    }


    @Test
    public void test2(){
        SubClass subClass = new SubClass();
        SubClass2 subClass2 = new SubClass2();

    }
}
