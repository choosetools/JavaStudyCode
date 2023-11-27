package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: EnumTest
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/27 22:29
 * @Description: TODO
 */
public class EnumTest {
    @Test
    public void test(){
        //假设以下的值是从数据库中获取到了枚举类的属性值
        String code = "Saturday";

        //此时，我们要去判断，当前的获取到的值属于哪一个枚举对象
        //不同的枚举对象，会执行不同的代码
        Weekend weekend = Weekend.getWeekendByCode(code);
        if (weekend != null) {
            switch (weekend){
                case MONDAY -> {
                    System.out.println("星期一");
                    break;
                }
                case TUESDAY -> {
                    System.out.println("星期二");
                    break;
                }
                case WEDNESDAY -> {
                    System.out.println("星期三");
                    break;
                }
                case THURSDAY -> {
                    System.out.println("星期四");
                    break;
                }
                case FRIDAY -> {
                    System.out.println("星期五");
                    break;
                }
                case SATURDAY -> {
                    System.out.println("星期六");
                    break;
                }
                case SUNDAY -> {
                    System.out.println("星期日");
                    break;
                }
            }
        }else {
            System.out.println("获取的数据有误，请检查！");
        }
    }
}
