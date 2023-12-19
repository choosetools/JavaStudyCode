package org.example;

import org.junit.Test;

/**
 * @ClassName: StringMethodTest
 * @Package: org.example
 * @Author cheng
 * @Create 2023/12/18 21:48
 * @Description: TODO
 */
public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s3);
    }


    @Test
    public void test2(){
        //contains()，是否包含
        String s1 = "helloworldhelloworldhelloworld";
        System.out.println(s1.contains("elo"));

        //索引从0开始
        System.out.println(s1.indexOf("e"));
        //从指定索引开始检索，返回的值是该字符串位于全局字符串的索引
        System.out.println(s1.indexOf("e", 5));

        //从指定的索引从后往前反向搜索
        System.out.println(s1.lastIndexOf("e"));
        //从指定的索引从后往前反向搜索，返回指定字符串第一次出现处的索引，注意是相对于全部字符串从左至右的索引值
        System.out.println(s1.lastIndexOf("e",19));
    }

    @Test
    public void test3(){
        String s1 = "helloworldhelloworldhelloworld";
        //截取后的字符串包含beginIndex索引位置的字符
        System.out.println(s1.substring(17));//rldhelloworld

        //从beginIndex开始截取到endIndex（不包含endIndex位置的字符）
        //相当于是beginIndex截取到endIndex-1.
        System.out.println(s1.substring(6, 11));//orldh
    }

    @Test
    public void test4(){
        char[] chars = new char[]{'1', '2','3','4','5','6','7','8','9','a','b','c','d'};
        String s1 = String.valueOf(chars);
        String s2 = String.valueOf(chars, 3, 9);
        String s3 = String.copyValueOf(chars);
        String s4 = String.copyValueOf(chars, 3, 9);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        System.out.println(s1.charAt(6));

    }

    @Test
    public void test5(){
        String s1 = "qwrywersdfaui";

    }
}
