package org.example.javabasics;

import java.util.Arrays;

/**
 * @ClassName: IntArrayUtility
 * @Package: org.example
 * @Author cheng
 * @Create 2023/10/25 19:18
 * @Description: int数组工具类
 */
public class IntArrayUtility {

    public static void main(String[] args) {
        int[] arr ={4, 7, 12, 33, 54, 78, 90, 103, 178, 234, 555, 987};
        System.out.println(getMaxValue(arr));
        System.out.println(getMinValue(arr));
        System.out.println(getAvgValue(arr));
        System.out.println(getSumValue(arr));
        printArr(arr);
        int[] copyArr = copyArr(arr);
        System.out.println(Arrays.toString(copyArr));
        reversalArr(arr);
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int index = getIndexBinarySearch(arr, 234);
        System.out.println(index);

    }
    //求最大值
    public static int getMaxValue(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    //求最小值
    public static int getMinValue(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return min;
    }

    //求总和
    public static int getSumValue(int[] arr){
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求平均数
    public static double getAvgValue(int[] arr){
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    //遍历数组
    public static void printArr(int[] arr){
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0){
                stringBuilder.append(" ");
            }
            stringBuilder.append(arr[i]);
            if (i != arr.length - 1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder);
    }

    //复制数组
    public static int[] copyArr(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //数组反转，在原基础上进行反转
    public static void reversalArr(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //数组排序
    public static void bubbleSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
    }

    //遍历查找
    public static int getIndexOfArr(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    //二分法查找
    public static int getIndexBinarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == num){
                return mid;
            }else if (arr[mid] > num){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
