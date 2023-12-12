package org.example.multithreading;

/**
 * @ClassName: Singleton
 * @Package: org.example.multithreading
 * @Author cheng
 * @Create 2023/12/12 20:22
 * @Description: TODO
 */
public class Singleton {
    private Singleton(){}
    private static Singleton singleton;
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
