package org.example.multithreading;

/**
 * @ClassName: ThreadSafeTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/11 16:16
 * @Description: 线程安全问题测试
 */
public class ThreadSafeTest {
    public static void main(String[] args) {
        TicketWindow2 ticket = new TicketWindow2();
        Thread t1 = new Thread(ticket, "A号窗口");
        Thread t2 = new Thread(ticket, "B号窗口");
        Thread t3 = new Thread(ticket, "C号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketWindow2 implements Runnable{
    public static int ticketNum = 100;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this) {
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩下" + ticketNum + "张");
                    ticketNum--;
                } else {
                    break;
                }
            }
        }
    }
}
