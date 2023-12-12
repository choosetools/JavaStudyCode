package org.example.multithreading;

/**
 * @ClassName: Bank
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/12 21:48
 * @Description: TODO
 */
public class LazySingletonSafeTest extends Thread {

    public Bank bank;

    @Override
    public void run() {
        this.bank = Bank.getInstance();
    }

    public static void main(String[] args) {
        LazySingletonSafeTest t1 = new LazySingletonSafeTest();
        LazySingletonSafeTest t2 = new LazySingletonSafeTest();
        t1.start();
        t2.start();
        //等t1和t2执行完毕后再执行
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.bank);
        System.out.println(t2.bank);
        System.out.println(t1.bank == t2.bank);
    }
}
class Bank{
    private Bank(){}
    private static Bank instance;

    //static方法，默认监视器为Bank.class
    public static synchronized Bank getInstance(){
        if (instance == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new Bank();
        }
        return instance;
    }
}
