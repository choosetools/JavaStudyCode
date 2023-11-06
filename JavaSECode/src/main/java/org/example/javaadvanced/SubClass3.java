package org.example.javaadvanced;

import org.example.javabasics.SuperClass2;
import org.junit.Test;

/**
 * @ClassName: SubClass3
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 15:20
 * @Description: TODO
 */
public class SubClass3 extends SuperClass2 {
    private int subPrivate;
    int subDefault;

    public int subPublic;

    protected int subProtected;


    @Test
    public void test(){
        SubClass3 subClass3 = new SubClass3();
        System.out.println(subClass3.supProtected);


        SuperClass2 superClass2 = new SuperClass2();
        //无法访问到父类对象中的protected属性
    }

}
