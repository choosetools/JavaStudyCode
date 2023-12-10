package org.example.multithreading;

import org.junit.jupiter.api.Order;

/**
 * @Author cheng
 * @ClassName ThreadConstructorTest
 * @Date 2023/12/10 9:38
 * @Version V1.0
 * @Description
 */
public class ThreadConstructorTest {
    public static void main(String[] args) {
        ThreadConstructor t1 = new ThreadConstructor();
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ ":" + i);
        }

    }
}

class ThreadConstructor extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + ":" + i);
        }
        Thread.yield();
    }
}

class ThreadMethod implements Runnable{

    @Override
    public void run() {

    }
}
