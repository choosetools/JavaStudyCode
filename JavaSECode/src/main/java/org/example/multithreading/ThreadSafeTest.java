package org.example.multithreading;

/**
 * @Author cheng
 * @ClassName ThreadSafeTest
 * @Date 2023/12/12 9:25
 * @Version V1.0
 * @Description
 */
public class ThreadSafeTest {
    public static void main(String[] args) {
        SellTicket sell = new SellTicket();
        Thread t1 = new Thread(sell, "A号窗口");
        Thread t2 = new Thread(sell, "B号窗口");
        Thread t3 = new Thread(sell, "C号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}

class SellTicket implements Runnable {

    private int ticketNum = 100;

    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                if (ticketNum > 0) {

                    //使用sleep()方法，让结果更加明显
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + "卖出了一张票，票号是：" + ticketNum);
                    ticketNum--;
                } else {
                    break;
                }
            }

        }
    }
}
