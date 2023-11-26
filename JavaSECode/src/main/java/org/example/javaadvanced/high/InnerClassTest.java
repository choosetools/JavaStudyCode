package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: InnerClassTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/26 14:42
 * @Description: TODO
 */
public class InnerClassTest {
    @Test
    public void test(){
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
    }
}
 class OuterClass{

    static class InnerClass{

    }
}
