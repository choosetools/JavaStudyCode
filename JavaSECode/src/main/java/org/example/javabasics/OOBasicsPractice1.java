package org.example.javabasics;

/**
 * @ClassName: OOBasicsPractice1
 * @Package: org.example
 * @Author cheng
 * @Create 2023/10/25 18:39
 * @Description: Java面向对象基础练习1
 */
public class OOBasicsPractice1 {
    public static void main(String[] args) {
//        Person2 person1 = new Person2();
//        person1.setName("cheng");
//        person1.setAge(1);
//        person1.setGender('男');
//        person1.study();
//        person1.addAge(5);
//
//        System.out.println(person1);
//        Person2 person2 = new Person2();
        Person2 p = new Person2();
        int i = p.method3(5, 4);
        System.out.println(i);


    }
}

class Person2 {
    private String name;

    private int age;

    private char gender;

    public void study(){
        System.out.println("studying");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age += addAge;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    //打印10*8的*矩形
    public void printRectangle(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }

    public int method3(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
