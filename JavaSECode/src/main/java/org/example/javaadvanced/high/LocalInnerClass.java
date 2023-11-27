package org.example.javaadvanced.high;

/**
 * @ClassName: LocalInnerClass
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/27 19:58
 * @Description: 局部内部类测试
 */
public class LocalInnerClass {
    public void method1(){
        //方法的内部类
        class MethodInnerClass{

        }
    }

    public Comparable getInstance(){
       // 提供实现了Comparable接口的类，局部内部类
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();

//        //方式二，提供了接口的匿名实现类的匿名对象
//        return new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
    }
}
