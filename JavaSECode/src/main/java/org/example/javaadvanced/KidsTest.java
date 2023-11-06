package org.example.javaadvanced;

/**
 * @ClassName: KidsTest
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 10:14
 * @Description: TODO
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSex(1);
        someKid.setSalary(0);
        someKid.manOrWoman();
        someKid.employeed();
    }
}
