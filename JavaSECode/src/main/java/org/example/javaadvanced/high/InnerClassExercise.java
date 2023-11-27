package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: InnerClassExercise
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/27 21:02
 * @Description: TODO
 */
public class InnerClassExercise {
    @Test
    public void test(){
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}
class OuterClass{

    int age;
    String name;
    private static int id;

    public static int getId(){
        return OuterClass.id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class InnerClass{

        public void method(){
            System.out.println(age);
            System.out.println(OuterClass.id);
        }
    }


}
