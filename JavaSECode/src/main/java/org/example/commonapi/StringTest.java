package org.example.commonapi;

/**
 * @ClassName: StringTest
 * @Package: org.example.commonapi
 * @Author cheng
 * @Create 2023/12/18 14:51
 * @Description: TODO
 */
public class StringTest {
    public static void main(String[] args) {
        int i = 1;
        Integer j = Integer.valueOf(2);
        Circle c = new Circle();
        change(i,j,c);
        //这里为1很好理解，因为int属于基本数据类型，值传递而不是引用传递
        System.out.println("i = " + i);//1
        //这里为什么为2呢？明明Integer属于引用数据类型，为什么不是12？
        //原因就在于Integer具有不变性，当我们去修改Integer的值时，实际上是去创建一个新的Integer对象
        //故没有在原对象的基础上进行修改
        System.out.println("j = " + j);//2
        System.out.println("c.radius = " + c.radius);//10.0
    }

    public static void change(int a ,Integer b,Circle c ){
        a += 10;
        //等价于  b = new Integer(b+10);即不是在原对象上进行修改，而是新建了一个包装类的对象
		b += 10;
        c.radius += 10;
    }
}
class Circle{
    double radius = 0;
}
