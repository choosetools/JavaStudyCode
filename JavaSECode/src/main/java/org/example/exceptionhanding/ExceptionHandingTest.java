package org.example.exceptionhanding;

import org.example.testpack.Person;
import org.example.testpack.Student;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @ClassName: ExceptionHandingTest
 * @Package: org.example.exceptionhanding
 * @Author cheng
 * @Create 2023/12/3 11:02
 * @Description: TODO
 */
public class ExceptionHandingTest {
    @Test
    public void test() {
        ArrayList<Person> arrayList = new ArrayList();
        while (true) {
            Person p1 = new Student();
            arrayList.add(p1);
        }

    }

    @Test
    public void test2() {
        test2();
    }

    @Test
    public void test3() {
        try {
            System.out.println("开始执行异常信息");
            int i = 1 / 0;
            System.out.println("结束执行异常信息");
        } catch (ArithmeticException ae) {
            //打印异常信息
            ae.printStackTrace();
        }
    }

    @Test
    public void test4() {
        try {
            int[] ints = new int[]{1, 2, 3, 4};
            for (int i = 0; i < 5; i++) {
                System.out.println(ints[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream("hello.txt");
    }
}


