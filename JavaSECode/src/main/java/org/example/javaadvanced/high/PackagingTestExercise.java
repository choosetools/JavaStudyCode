package org.example.javaadvanced.high;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @ClassName: PackagingTestExercise
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/30 21:00
 * @Description: TODO
 */
public class PackagingTestExercise {
    @Test
    public void test(){
        Vector<Integer> v = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        System.out.print("请输入学生成绩（以负数代表输入结束）：");
        while (true){
            String s = scanner.nextLine();
            //判断输入的字符串是否是数字类型
            if(s.matches("-?\\d+")) {
                int number = Integer.parseInt(s);
                if (number < 0){
                    break;
                }
                max = Math.max(max, number);
                v.add(number);
            }else {
                System.out.print("输入的数据类型有误，请输入数字类型：");
            }
        }

        System.out.println("您输入的学生成绩以及其等级为：");
        for (int i = 0; i < v.size(); i++) {
            Integer garde = v.elementAt(i);
            String level;
            if (max - garde <= 10){
                level = "A";
            }else if (max - garde <= 20){
                level = "B";
            }else if (max - garde <= 30){
                level = "C";
            }else {
                level = "D";
            }
            System.out.println(garde + "分，等级：" + level + "级");
        }
    }

    @Test
    public void test2(){
        System.out.println(true ? 90 : 100.0);

        System.out.println(true ? new Integer(90) : new Double(100.0));
    }

    @Test
    public void test3(){
        Integer x = 10;
        Double y = 10.0;
        System.out.println(x+y);
    }
}
