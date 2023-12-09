package org.example.exceptionhanding;

import java.util.Scanner;

/**
 * @ClassName: DivisionDemo
 * @Package: org.example.exceptionhanding
 * @Author cheng
 * @Create 2023/12/5 19:01
 * @Description: TODO
 */
public class DivisionDemo {
//    public static double divide(String dividend, String divisor){
////        if (dividend.matches())
//    }

    public static void main(String[] args) {
        DivisionDemo demo = new DivisionDemo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入被除数：");
        String dividend = scanner.nextLine();
        System.out.print("请输入除数：");
        String divisor = scanner.nextLine();
//        System.out.println("商为：" + divide(dividend, divisor));
        scanner.close();
    }
}
class BelowZeroException extends RuntimeException{
    static final long serivalVersionUID = 1L;

    BelowZeroException(){}

    BelowZeroException(String message){
        super(message);
    }
}
