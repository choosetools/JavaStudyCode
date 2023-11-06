package org.example.javaadvanced;

import org.junit.Test;

/**
 * @ClassName: SubClass2
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 15:08
 * @Description: TODO
 */
public class SubClass2 extends SuperClass{
    private int subPrivate;
    int subDefault;

    public int subPublic;

    protected int subProtected;

    @Test
    public void test(){
        SubClass2 subClass2 = new SubClass2();
        System.out.println(subClass2.supProtected);
    }
}
