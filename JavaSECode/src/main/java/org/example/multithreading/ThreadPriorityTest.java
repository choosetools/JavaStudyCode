package org.example.multithreading;

/**
 * @ClassName: ThreadPriorityTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/10 18:09
 * @Description: TODO
 */
public class ThreadPriorityTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityTest(), "优先级为1的线程");
        Thread t2 = new Thread(new PriorityTest(),"优先级为10的线程");
        t1.setPriority(1);
        t2.setPriority(10);
        //其实默认情况下main线程的优先级就是5
        Thread.currentThread().setPriority(5);
        t1.start();
        t2.start();
        for (int i = 0; i < 100; i++) {
            //释放CPU，让优先级更高或者相等的线程执行，也可能出现释放CPU后又拿起的情况
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class PriorityTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
