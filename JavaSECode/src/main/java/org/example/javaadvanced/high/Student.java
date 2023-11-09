package org.example.javaadvanced.high;

import java.io.Serializable;

/**
 * @ClassName: Student
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/9 19:04
 * @Description: TODO
 */
public class Student implements Cloneable, Serializable {
    private String name;

    private Bag bag;

    public Student(String name, Bag bag) {
        this.name = name;
        this.bag = bag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    @Override
    public Student clone() {
        try {
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部项
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
