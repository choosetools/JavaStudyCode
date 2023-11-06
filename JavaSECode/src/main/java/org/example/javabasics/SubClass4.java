package org.example.javabasics;

import org.junit.Test;

/**
 * @ClassName: SubClass4
 * @Package: org.example.javabasics
 * @Author cheng
 * @Create 2023/11/5 15:25
 * @Description: TODO
 */
public class SubClass4 extends SuperClass2{
    private int subPrivate;
    int subDefault;

    protected int subProtected;

    public int subPublic;

    @Test
    public void test(){
        SuperClass2 superClass2 = new SuperClass2();
        System.out.println(supProtected);
    }
}
