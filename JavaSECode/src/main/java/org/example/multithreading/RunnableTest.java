package org.example.multithreading;

/**
 * @ClassName: RunnableTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/9 21:51
 * @Description: TODO
 */
public class RunnableTest {
    public static void main(String[] args) {

        Thread t = new Thread(new print());
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
class print implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
