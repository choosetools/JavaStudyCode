package org.example.multithreading;

/**
 * @ClassName: ThreadSafeMethodTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/12 17:44
 * @Description:
 */
public class ThreadSafeMethodTest2 {
    public static void main(String[] args) {
        TicketSafeMethod ticketSafeMethod = new TicketSafeMethod();
        Thread t1 = new Thread(ticketSafeMethod,"A号窗口");
        Thread t2 = new Thread(ticketSafeMethod,"B号窗口");
        Thread t3 = new Thread(ticketSafeMethod,"C号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketSafeMethod implements Runnable{
    private int ticketNum = 100;
    private boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag){
            sellTicket();
        }
    }

    //静态方法，同步监视器为类名.class
    //非静态方法，同步监视器为this
    //由于使用的是继承Thread类的方式创建多线程，故每个线程的对象不同，故只能使用静态的同步方法
    private synchronized void sellTicket(){
        if (ticketNum > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "售卖了一张票，票号是：" + ticketNum);
            ticketNum--;
        }else {
            isFlag = false;
        }
    }
}
