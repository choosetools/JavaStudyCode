package org.example.multithreading;

/**
 * @Author cheng
 * @ClassName ThreadSafeTest2
 * @Date 2023/12/12 15:21
 * @Version V1.0
 * @Description
 */
public class ThreadSafeTest2 {
    public static void main(String[] args) {
        TicketWindow t1 = new TicketWindow("A号窗口");
        TicketWindow t2 = new TicketWindow("B号窗口");
        TicketWindow t3 = new TicketWindow("C号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketWindow extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized (TicketWindow.class) {
                if (ticket > 0) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "卖出了一张票，票号是：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }

    public TicketWindow(String name) {
        super(name);
    }
}