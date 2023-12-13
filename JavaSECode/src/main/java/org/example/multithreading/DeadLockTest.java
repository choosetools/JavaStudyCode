package org.example.multithreading;

/**
 * @Author cheng
 * @ClassName DeadLockTest
 * @Date 2023/12/13 10:54
 * @Version V1.0
 * @Description
 */
public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock1 t1 = new DeadLock1();
        DeadLock2 t2 = new DeadLock2();
        t1.start();
        t2.start();
    }
}

class DeadLock1 extends Thread{
    @Override
    public void run() {
        System.out.println("开始执行A的run()方法");
        synchronized (DeadLock1.class){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("执行完A中的sleep()方法");
            synchronized (DeadLock2.class){
                System.out.println("!!!!!!!!!!!!!");
            }
        }
    }
}
class DeadLock2 extends Thread{
    @Override
    public void run() {
        System.out.println("开始执行B的run()方法");
        synchronized (DeadLock2.class){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("执行完B中的sleep()方法");
            synchronized (DeadLock1.class){
                System.out.println("!!!!!!!!!!!!!");
            }
        }
    }
}
