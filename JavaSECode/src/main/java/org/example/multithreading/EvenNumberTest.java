package org.example.multithreading;

/**
 * @ClassName: EvenNumberTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/9 17:57
 * @Description: TODO
 */
public class EvenNumberTest {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                for (int i = 1; i < 100; i += 2) {
//                    System.out.println(i);
//                }
//            }
//        };
//        Thread t2 = new Thread(){
//            @Override
//            public void run() {
//                for (int i = 2; i <= 100; i += 2) {
//                    System.out.println(i);
//                }
//            }
//        };
//        t1.start();
//        t2.start();
//    }

    public static void main(String[] args) {
        EvenNumberPrint p = new EvenNumberPrint();
        Thread t1 = new Thread(p);
        EvenNumberPrint2 p2 = new EvenNumberPrint2();
        //第二个参数可用于指定线程名

        t1.start();
        t1 = new Thread(p2);
        t1.start();
        //main()方法对应的主线程执行的操作
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println(Thread.currentThread().getName() + ":" + i);
//                }
//            }
//        }).start();
    }
}

class EvenNumberPrint implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class EvenNumberPrint2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
