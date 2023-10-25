package org.example.javabasics;

import java.util.Arrays;

/**
 * @ClassName: ObjectArrayTest
 * @Package: org.example.javabasics
 * @Author cheng
 * @Create 2023/10/25 20:24
 * @Description: 对象数组测试
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。 创建20个学生对象，
 * 学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class ObjectArrayTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i + 1);
        }
        System.out.println(Arrays.toString(students));

        System.out.println("******************************************");

        //打印出3年级的学生信息
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3){
                System.out.println(students[i]);
            }
        }

        System.out.println("*****************************************");

        //使用冒泡排序将学生按照成绩进行排序
        for (int i = 0; i < students.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score > students[j + 1].score){
                    Student student = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = student;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }

        System.out.println(Arrays.toString(students));
    }
}
class Student{
    //学号
    int number;
    //年级
    int state;
    //成绩
    int score;
    public Student(int number){
        this.number = number;
        state = (int) (Math.random() * 6) + 1;
        score = (int) (Math.random() * 101);
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
