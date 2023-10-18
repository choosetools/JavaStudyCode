package org.example;

import java.util.Scanner;

/**
 * @ClassName: ArrayTest
 * @Package: org.example
 * @Author cheng
 * @Create 2023/10/17 16:11
 * @Description: 数组测试类
 */
public class ArrayTest {
    public static int age;
    public static String name;
        public static void main(String[] args) {
            //声明数组
            //静态初始化
    //        double[] prices;
    //        prices = new double[]{20, 42, 123, 43};
    //        String[] foods = new String[]{"年后", "大饼", "豆汁", "炸酱面"};
    //
    //        //动态初始化
    //        String[] foods1 = new String[4];
    //        //不论是静态初始化还是动态初始化，一旦初始化完成，数组的长度就确定了，并且不可修改
    //        System.out.println(age);
    //        System.out.println(name);
    //
    //        for (String food : foods) {
    //            System.out.println(food);
    //        }

            //用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
            //{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
    //        String[] week = new String[]{ "星期一", "星期二", "星期三", "星期四", "星期五", "星期六","星期天"};
    //        Scanner scanner = new Scanner(System.in);
    //        while (true) {
    //            System.out.println("请输入[1-7]数字：");
    //            String s = scanner.nextLine();
    //            if (s.matches("\\d+")){
    //                int i = Integer.parseInt(s);
    //                if (i >= 1 && i <= 7){
    //                    System.out.println("对应的星期：" + week[i-1]);
    //                    break;
    //                }
    //            }
    //        }
    //        scanner.close();
    //
            //从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
            //
            //- 成绩>=最高分-10  等级为’A’
            //
            //- 成绩>=最高分-20  等级为’B’
            //
            //- 成绩>=最高分-30  等级为’C’
            //
            //- 其余            等级为’D’
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入学生人数：");
            int num;
            while (true) {
                String s = scanner.nextLine();
                if (s.matches("\\d+")) {
                    num = Integer.parseInt(s);
                    if (num <= 200 & num > 0) {
                        break;
                    }
                }
                System.out.print("请输入正确的数字：");
            }

            System.out.println("请输入" + num + "个成绩：");
            int[] grades = new int[num];
            int max = 0;
            for (int i = 0; i < grades.length; i++) {
                while (true){
                    String gradeString = scanner.nextLine();
                    if (gradeString.matches("\\d+")){
                        int grade = Integer.parseInt(gradeString);
                        if (grade >= 0 && grade <= 100) {
                            grades[i] = grade;
                            max = Math.max(max, grade);
                            break;
                        }
                    }
                    System.out.print("请输入正确的成绩：");
                }
            }
            scanner.close();
            System.out.println("最高分是" + max);
            //5. 遍历数组元素，输出各自的分数，并根据其分数与最高分的差值，获取各自的等级
            char grade;
            for (int i = 0; i < grades.length; i++) {
                if(grades[i] >= max - 10){
                    grade = 'A';
                }else if(grades[i] >= max - 20){
                    grade = 'B';
                }else if(grades[i] >= max - 30){
                    grade = 'C';
                }else{
                    grade = 'D';
                }
                System.out.println("student " + i + " socre is " + grades[i] + ", grade is " + grade);
            }
        }


}