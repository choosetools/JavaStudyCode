package org.example.multithreading;


/**
 * @Author cheng
 * @ClassName ThreadConstructorTest
 * @Date 2023/12/10 9:38
 * @Version V1.0
 * @Description
 */
public class ThreadConstructorTest {
    public static void main(String[] args) {
        ThreadConstructor t1 = new ThreadConstructor();
        System.out.println("线程t1的优先级为：" + t1.getPriority());
        System.out.println("线程main的优先级为：" + Thread.currentThread().getPriority());
        //设置优先级
        t1.setPriority(10);
        Thread.currentThread().setPriority(1);
        t1.start();

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ ":" + i);
        }
        System.out.println(t1.isAlive());

    }
}

class ThreadConstructor extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + ":" + i);
            if (i % 20 == 0){
                Thread.yield();
            }
        }
    }
}

class ThreadMethod implements Runnable{

    @Override
    public void run() {

    }
}
