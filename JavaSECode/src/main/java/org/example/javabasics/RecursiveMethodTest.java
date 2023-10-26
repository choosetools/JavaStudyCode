package org.example.javabasics;

/**
 * @Author cheng
 * @ClassName RecursiveMethodTest
 * @Date 2023/10/26 15:55
 * @Version V1.0
 * @Description 递归方法测试
 */
public class RecursiveMethodTest {
    public static void main(String[] args) {
        System.out.println(fibonacciSequence(45));
    }

    //获取斐波那契数列指定数量的数
    public static int fibonacciSequence(int num){
        if (num == 1 || num == 2){
            return 1;
        }else {
            return fibonacciSequence(num - 1) + fibonacciSequence(num - 2);
        }
    }
}
