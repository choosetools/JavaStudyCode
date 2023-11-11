package org.example.javaadvanced.high;

/**
 * @ClassName: SingletonTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/11 15:53
 * @Description: TODO
 */
public class SingletonTest {
}
class Bank{
    private static Bank bank;
    private Bank(){

    }

    public static Bank getBank(){
        return bank;
    }
}
