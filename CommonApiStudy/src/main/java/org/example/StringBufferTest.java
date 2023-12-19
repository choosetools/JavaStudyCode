package org.example;

/**
 * @ClassName: StringBufferTest
 * @Package: org.example
 * @Author cheng
 * @Create 2023/12/19 19:30
 * @Description: TODO
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");

        str.setLength(4);
        for (char c : str.toString().toCharArray()) {
            byte b = (byte) c;
            System.out.println(b);
        }

        System.out.println("************");
        str.setLength(1);
        System.out.println(str);
    }
}
