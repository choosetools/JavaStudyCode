package org.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author cheng
 * @ClassName ExecutorsTest
 * @Date 2023/12/15 10:48
 * @Version V1.0
 * @Description
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        //创建指定线程数量的线程池
        //这是接口类型
        ExecutorService service = Executors.newFixedThreadPool(10);
        //将接口转换成实现类对象
        ThreadPoolExecutor threadPool = (ThreadPoolExecutor) service;

        threadPool.setMaximumPoolSize(50);

        ticketWindow ticket = new ticketWindow();
        threadPool.execute(ticket);
        threadPool.execute(ticket);
        threadPool.execute(ticket);

        threadPool.shutdown();
    }
}

//卖票
class ticketWindow implements Runnable{
    private int ticketNum = 300;

    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticketNum > 0) {
                System.out.println(Thread.currentThread().getName() + "卖了一张票，票号为：" + ticketNum);
                ticketNum--;
                lock.unlock();
            }else {
                break;
            }
        }
    }
}