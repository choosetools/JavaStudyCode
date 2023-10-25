package org.example.javabasics;

/**
 * @ClassName: OverLoadExer
 * @Package: org.example.javabasics
 * @Author cheng
 * @Create 2023/10/25 22:34
 * @Description: 方法重载测试
 */
public class OverLoadExer {
    public static void main(String[] args) {
        char[] chars = new char[]{'2', 't', 'e'};
        System.out.println();
    }
    public int mOL(int num){
        return num * num;
    }

    public int mOL(int num1, int num2){
        return num1 * num2;
    }

    public void mOL(String str){
        System.out.println(str);
    }

    public int max(int num1, int num2){
        return Math.max(num1, num2);
    }

    public double max(double d1, double d2){
        return Math.max(d1, d2);
    }

    public double max(double d1, double d2, double d3){
        d1 = Math.max(d1, d2);
        return Math.max(d1, d3);
    }
}
