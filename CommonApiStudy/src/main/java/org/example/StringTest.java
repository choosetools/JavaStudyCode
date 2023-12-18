package org.example;

import org.junit.Test;

/**
 * @ClassName: StringTest
 * @Package: org.example
 * @Author cheng
 * @Create 2023/12/18 15:28
 * @Description: TODO
 */
public class StringTest {
    @Test
    public void test(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        //对于引用数据类型来说，==判断的是地址值
        System.out.println(s1 == s2);//true，说明二者的地址值相同
        System.out.println(s1.equals(s2));//true，说明值相同
        System.out.println(s1 == s3);//false，说明地址值不同
        //也就是说，通过直接直接赋值的方式创建的String对象，如果已经存在，则直接赋予，而不重新创建
        //但是通过new的方式创建的String对象，则是一定重新创建的
        System.out.println(s1.equals(s3));
    }

    @Test
    public void test2(){
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1 == s2);//false
        //这里为false，是不是说明使用new的方式创建的String对象不会共享？
    }

    @Test
    public void test3(){
        final String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

//        System.out.println(s3 == s4);
//        System.out.println(s3 == s5);
//        System.out.println(s3 == s6);
//        System.out.println(s3 == s7);
//        System.out.println(s5 == s6);
//        System.out.println(s5 == s7);

        System.out.println(s3 == s5);
    }

    @Test
    public void test4(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = s1.concat("world");
        String s5 = s1.concat(s2);
        String s6 = "hello".concat("world");
        String s7 = "hello".concat(s2);

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
    }
}
