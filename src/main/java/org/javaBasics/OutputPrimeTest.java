package org.javaBasics;

/**
 * @author cheng
 */
public class OutputPrimeTest {
    public static void main(String[] args) {
       long start = System.currentTimeMillis();
        int count = 0;//记录质数的个数
        //题目：找出100000以内所有的素数
        int limit = 100000;
        boolean[] isPrime = new boolean[limit];
        //初始化，假设所有的数都是素数
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        //埃拉托斯特尼算法，把不是素数的因子全部筛掉
        for (int i = 2; i * i < limit; i++) {
            if (isPrime[i]) {
                //把i的所有倍数全部设置为false，i从2开始
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        //输出素数
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                count++;
            }
        }



//        for(int i = 2;i <= 100000;i++){  //i
//
//            boolean isFlag = true; //用于标识i是否被除尽过
//
//            for(int j = 2;j <= Math.sqrt(i);j++){ //优化2：将循环条件中的i改为Math.sqrt(i)
//
//                if(i % j == 0){ //表明i有约数
//                    isFlag = false;
//                    break;//优化1：主要针对非质数起作用
//                }
//
//            }
//
//            //判断i是否是质数
//            if(isFlag){ //如果isFlag变量没有给修改过值，就意味着i没有被j除尽过。则i是一个质数
//                //System.out.println(i);
//                count++;
//            }
//
//        }
        System.out.println("质数的个数为：" + count);
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (end - start) + "ms");
    }
}