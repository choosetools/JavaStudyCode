package org.example.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: ProducerConsumerTest
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/14 19:15
 * @Description: TODO
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        Consumer consumer2 = new Consumer(clerk);
        producer.setName("生产者1");
        consumer1.setName("消费者1");
        consumer2.setName("消费者2");
        producer.start();
        consumer1.start();
        consumer2.start();


        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call()方法");
                return null;
            }
        };
        new Thread(new FutureTask<Object>(callable));
    }
}

class Clerk {
    //假设最高为5个产品
    //最少为0个
    private int productNum = 0;

    //增加产品的数量
    public synchronized void addProduct() {
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "个产品");
            notifyAll();
        }
    }

    //减少产品的数量
    public synchronized void minusProduct() {
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "个产品");
            productNum--;
            notifyAll();
        }
    }
}

class Producer extends Thread {//生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.addProduct();

        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.minusProduct();
        }
    }
}
