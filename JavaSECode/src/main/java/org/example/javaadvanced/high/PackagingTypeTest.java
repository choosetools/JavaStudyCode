package org.example.javaadvanced.high;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author cheng
 * @ClassName PackagingTypeTest
 * @Date 2023/11/30 9:20
 * @Version V1.0
 * @Description 包装类测试
 */
public class PackagingTypeTest {
    @Test
    public void test(){
        //使用包装类的构造方法
        Integer i1 = new Integer(100);
        Double d1 = new Double(1.1);

        //使用包装类的valueOf()方法
        Character c1 = Character.valueOf('A');
        Long l1 = Long.valueOf(10L);
    }

    @Test
    public void test2(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer i1 = 12; //相当于Integer i1 = Integer.valueOf(12)
        arrayList.add(i1);
        i1 = i1 + 3;
        int i2 = i1; //相当于int i2 = intValue(i1)
        Integer i3 = i2 + 5; //相当于Integer i3 = Integer.valueOf(Integer.valueOf(i2) + 5)
        arrayList.add(i2);
        arrayList.add(i3);


        Integer i = (int) 100L;

    }
}
