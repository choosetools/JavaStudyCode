package org.example.multithreading;

/**
 * @ClassName: ThreadSafeMethodTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/12 17:44
 * @Description:
 */
public class ThreadSafeMethodTest {
    public static void main(String[] args) {
        TicketMethod t1 = new TicketMethod("A号窗口");
        TicketMethod t2 = new TicketMethod("B号窗口");
        TicketMethod t3 = new TicketMethod("C号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketMethod extends Thread{
    private static int ticketNum = 100;
    private static boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag){
            sellTicket();
        }
    }

    //静态方法，同步监视器为：类名.class
    //非静态方法，同步监视器为：this
    //由于使用的是继承Thread类的方式创建多线程，故每个线程的对象不同，故只能使用静态的同步方法
    private static synchronized void sellTicket(){
        if (ticketNum > 0){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "售卖了一张票，票号是：" + ticketNum);
            ticketNum--;
        }else {
            isFlag = false;
        }
    }

    public TicketMethod(String name) {
        super(name);
    }
}
