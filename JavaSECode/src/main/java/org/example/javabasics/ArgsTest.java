package org.example.javabasics;

import org.junit.Test;

/**
 * @Author cheng
 * @ClassName ArgsTest
 * @Date 2023/10/26 8:53
 * @Version V1.0
 * @Description 可变个数形参测试
 */
public class ArgsTest {

    @Test
    public void test(){
        print();
    }
    public static void main(String[] args) {
        ArgsTest argsTest = new ArgsTest();
        int[] ints = new int[]{4, 3, 12, 4};
        argsTest.print(4, 5, 6, 2);
    }

    public void print(int... nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    //需要注意的是：int[]被认为是与int...同一种类型，不构成重载

//    public void print(int[] nums){
//
//    }


    public String concat(String operator, String... strs){
        if (strs.length == 0){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (i == 0){
                stringBuilder.append(strs[i]);
            }else {
                stringBuilder.append(operator).append(strs[i]);
            }
        }
        return stringBuilder.toString();
    }
}
