package org.example.multithreading;

/**
 * @ClassName: ThreadLifecycleTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/11 15:15
 * @Description: TODO
 */
public class ThreadLifecycleTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LifecycleTest());
        System.out.println(t1.getState());
    }
}

class LifecycleTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
