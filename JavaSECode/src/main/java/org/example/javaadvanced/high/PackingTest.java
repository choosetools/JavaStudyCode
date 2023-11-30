package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: PackingTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/30 20:32
 * @Description: TODO
 */
public class PackingTest {
    @Test
    public void test(){
        String s1 = String.valueOf(123);
        String s2 = String.valueOf(false);
        String s3 = String.valueOf('a');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        char c1 = s3.charAt(0);

        System.out.println(i1);
        System.out.println(b1);
        System.out.println(c1);
    }
}
