package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: TwoDimensionalArrayTest
 * @Package: org.example
 * @Author cheng
 * @Create 2023/10/18 16:53
 * @Description: 二维数组代码测试
 */
public class TwoDimensionalArrayTest {
    @Test
    public void test(){
//        int[][] arr = new int[][]{{3,4}, {1234}, {54,31,8,5}};
//        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
//
//        //地址值
//        System.out.println(arr[0][0]);

        //存储3个小组的学员成绩，分开存储，使用二维数组
        int[][] grades = new int[3][];
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个小组学院成绩，当输入0时结束：");
            int num = 0;
            while (true) {
                String s = scanner.nextLine();
                //判断输入的是否是数字（可以是多个数字）
                if (s.matches("\\d+")) {
                    int grade = Integer.parseInt(s);
                    if (grade > 100 || grade < 0) {
                        System.out.println("输入错误，请重新输入：");
                        continue;
                    }
                    if (grade == 0) {
                        break;
                    }
                    arrayList.add(grade);
                    num++;
                }else {
                    System.out.println("输入错误，请重新输入：");
                }
            }
            grades[i] = new int[num];
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = arrayList.get(j);
            }
            arrayList = new ArrayList<>();
        }
        System.out.println(Arrays.deepToString(grades));


    }

    @Test
    public void test2(){
        int[][] arr = new int[3][2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);

        System.out.println("*********************************");
        arr = new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);

        //这就是说，如果没有为二维数组列指定长度，那么编译器就不知道二维数组中每个一维数组的长度是多少，此时就不会为一维数组初始化
        //但是，如果已经为二维数组指定了长度，那么编译器就知道了二维数组中每一个一维数组的长度是多少，此时就会给每个一维数组都进行了初始化，且给了一维数组中元素相应的初始值，并将地址值赋值给了二维数组变量和一维数组变量
        //这就是输出这些结果的原因所在
    }

    @Test
    public void test3(){
        int[][] arr = new int[3][4];
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 8;
        arr[1][0] = 12;
        arr[1][1] = 9;
        arr[2][0] = 7;
        arr[2][2] = 6;
        arr[2][3] = 4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    /*
    打印出一个杨辉三角形
     */
    @Test
    public void test4(){
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i){
                    arr[i][j] = 1;
                    continue;
                }
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0){
                    break;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void test5(){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 90) + 10;
        }


        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        int index = 0;
        //这里可以从1开始
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }

            sum += arr[i];
            min = Math.min(min, arr[i]);
        }
        double avg = sum / 10.0;
        System.out.println("最大值是：" + max);
        System.out.println("最大值的下标：" + index);
        System.out.println("最小值是：" + min);
        System.out.println("总和是：" + sum);
        System.out.println("平均值是：" + avg);

        System.out.println(Arrays.toString(arr));

    }

    /*
    找出所有最值的下标
     */
    @Test
    public void test6(){
        int[] arr = new int[]{12,0,15,99, 12, 43, 2,13, 99,32,99};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 90) + 10;
//        }
        //找最大值
        int max = arr[0];
        String index = "0";
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i + "";
            }else if(arr[i] == max){
                index += "," + i;
            }
        }

        System.out.println("最大值是" + max);
        System.out.println("最大值的下标是[" + index+"]");
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test7(){
//        int[] arr = new int[6];
//        for (int i = 0; i < arr.length; i++) {
//            while (true) {
//                boolean flag = false;
//                int num = (int) (Math.random() * 30 + 1);
//                for (int j = 0; j < i; j++) {
//                    if (num == arr[j]){
//                        flag = true;
//                    }
//                }
//                if (!flag){
//                    arr[i] = num;
//                    break;
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));



        //更优的方法，这个方法是使用双重循环，然后使用当前的index与之前的所有index数组进行比较
        //如果有相等的，就让当前的index - 1，然后index++，重新给index对应的数组元素赋值，再比较
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    /*
    数组的复制
     */
    @Test
    public void test8(){
        int[] array1 = {2, 3, 5, 7, 11 ,13, 17, 19};
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }
    /*
    数组的反转
     */
    @Test
    public void test9(){
        int[] arr = new int[]{45,65,23,7,344,73,32,90, 1};
        System.out.println(Arrays.toString(arr));

        //反转方式1
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        //反转方式2
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test10(){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;
        System.out.println(Arrays.toString(newArr));
    }

    @Test
    public void test11(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < 4){
                newArr[i] = arr[i];
            }else {
                newArr[i] = arr[i + 1];
            }

        }
        System.out.println(Arrays.toString(newArr));
    }
}
