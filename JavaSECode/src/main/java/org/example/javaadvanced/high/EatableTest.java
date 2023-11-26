package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: EatableTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/25 22:23
 * @Description: TODO
 */
public class EatableTest {
    @Test
    public void test(){
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
interface Eatable{
    void eat();
}
class Chinese implements Eatable{

    @Override
    public void eat() {
        System.out.println("用筷子吃饭");
    }
}
class American implements Eatable{

    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}
class Indian implements Eatable{

    @Override
    public void eat() {
        System.out.println("用手抓饭");
    }
}
