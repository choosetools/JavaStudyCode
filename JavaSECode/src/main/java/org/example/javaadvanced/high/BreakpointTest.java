package org.example.javaadvanced.high;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Author cheng
 * @ClassName BreakpointTest
 * @Date 2023/12/1 10:39
 * @Version V1.0
 * @Description
 */
public class BreakpointTest {
    public int age;
    @Test
    public void test(){
        age = 12;
        System.out.println(age);
    }

    @Test
    public void test2(){
        int[] ints = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        scanner.close();
    }
}
