package org.example.javaadvanced.high;

import org.example.javaadvanced.Boy;

/**
 * @ClassName: CloneTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/9 16:52
 * @Description: TODO
 */
public class CloneTest implements Cloneable{

    private String name;

    private Boy boy;

    public Boy getBoy() {
        return boy;
    }

    public void setBoy(Boy boy) {
        this.boy = boy;
    }

    public CloneTest(String name, Boy boy){
        this.name = name;
        this.boy = boy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //方法的重写要求抛出的异常不能大于父类方法的异常范围
    @Override
    public CloneTest clone() throws CloneNotSupportedException{
        return (CloneTest) super.clone();
    }

    @Override
    public String toString() {
        return "CloneTest{" +
                "name='" + name + '\'' +
                ", boy=" + boy +
                '}';
    }
}
