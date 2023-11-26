package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: InterfaceConflictTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/26 10:34
 * @Description: TODO
 */
public class InterfaceConflictTest {
    @Test
    public void test(){
    }
}
interface Friend {
    default void date(){//约会
        System.out.println("吃喝玩乐");
    }
}

interface Classmates{
    default void date(){
        System.out.println("图书馆学习");
    }
}

interface Son extends Friend, Classmates{
    default void date(){
        Friend.super.date();
    }
}
