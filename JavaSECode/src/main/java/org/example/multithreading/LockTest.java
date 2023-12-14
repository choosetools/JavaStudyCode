package org.example.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: LockTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/13 18:03
 * @Description: TODO
 */
public class LockTest {
    public static void main(String[] args) {
        Window t1 = new Window( "A号窗口");
        Window t2 = new Window("B号窗口");
        Window t3 = new Window("C号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Window extends Thread{

    private static int ticket = 100;
    //由于这里使用的是Thread子类的方式实现多线程，要想让lock对象相同，则应该设置成static类型的
    private static final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
                //加锁
                lock.lock();
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，票号是：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //释放锁
                lock.unlock();
            }
        }
    }

    public Window(String name) {
        super(name);
    }
}