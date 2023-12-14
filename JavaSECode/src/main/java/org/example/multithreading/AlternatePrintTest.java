package org.example.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author cheng
 * @ClassName AlternatePrintTest
 * @Date 2023/12/14 14:48
 * @Version V1.0
 * @Description
 */
public class AlternatePrintTest {
    public static void main(String[] args) {
        PrintThread print = new PrintThread();
        Thread t1 = new Thread(print, "线程1");
        Thread t2 = new Thread(print, "线程2");
        t1.start();
        t2.start();

    }
}

class PrintThread implements Runnable {

    private int num = 1;
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                //对于线程中包含wait()与notify()方法时
                //只能使用synchronized同步代码块或同步方法的方式
                //且wait()方法和notify()的调用者必须是锁对象
                //故wait()方法和notify()方法必须声明在同步代码块或同步方法中
                //不能声明在其他的位置
                synchronized (this) {
                    //注意，对于多个线程使用run()方法要实现线程间的通信时
                    //必须将notify()或notifyAll()方法放在前面
                    //如果是先执行wait()方法，那么所有线程都会被停止
                    //而无法被唤醒
                    notify();
                    if (num <= 100) {
                        System.out.println(Thread.currentThread().getName() + "打印了一个数字：" + num);
                        num++;
                    } else {
                        break;
                    }
                    wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}