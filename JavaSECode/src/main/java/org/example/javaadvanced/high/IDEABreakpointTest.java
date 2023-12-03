package org.example.javaadvanced.high;

/**
 * @ClassName: IDEABreakpointTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/12/2 10:49
 * @Description: TODO
 */
public class IDEABreakpointTest {
    public int age;
    {
        age = 1;
    }
    public IDEABreakpointTest(int age){
        this.age = age;
    }
    public void printAge(){
        System.out.println("age的值为：" + age);
    }

    public int getAge(){
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
//        int i = 1/0;
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
        System.out.println("进入了getAge()方法");
        return age;
    }

    public static void main(String[] args) {
        IDEABreakpointTest test = new IDEABreakpointTest(10);
        System.out.println(test.getAge());
    }
}
