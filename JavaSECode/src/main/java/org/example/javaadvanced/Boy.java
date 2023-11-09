package org.example.javaadvanced;

/**
 * @ClassName: Boy
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/10/29 22:50
 * @Description: this关键字的练习1
 */
public class Boy {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶" + girl.getName());
    }

    public void shout(){
        if (this.age >= 22){
            System.out.println("我终于可以结婚了");
        }else {
            System.out.println("我只能多谈恋爱");
        }
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
