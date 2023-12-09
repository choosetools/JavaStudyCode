package org.example.exceptionhanding;

import java.util.Scanner;

/**
 * @ClassName: MyException
 * @Package: org.example.exceptionhanding
 * @Author cheng
 * @Create 2023/12/5 17:40
 * @Description: TODO
 */
public class MyException extends RuntimeException{
    @java.io.Serial
    static final long serialVersionUID = 1234567890L;

    public MyException(){
    }

    public MyException(String message){
        super(message);
    }

//    public static void main(String[] args) {
//        MyExceptionTest test = new MyExceptionTest();
//        System.out.println("输入的最大值为：" + test.test());
//    }


}

class MyExceptionTest{
    //要求客户输入一段正整数，并返回数字的最大值，当输入的数字为0时，停止输入
    public int test(){
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串正整数：");
        try {
            while (true) {
                String s = scanner.nextLine();
                //判断s是否是一串正整数数字类型
                if (s.matches("[0-9]+")) {
                    int i = Integer.parseInt(s);
                    if (i != 0) {
                        max = Math.max(i, max);
                    } else {
                        break;
                    }
                } else {
                    throw new MyException("输入的数字类型有误！");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
        return max;

    }
}
