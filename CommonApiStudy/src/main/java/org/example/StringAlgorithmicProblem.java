package org.example;

import org.junit.Test;

/**
 * @ClassName: StringAlgorithmicProblem
 * @Package: org.example
 * @Author cheng
 * @Create 2023/12/19 16:18
 * @Description: TODO
 */
public class StringAlgorithmicProblem {
    public static void main(String[] args) {
        StringAlgorithmicProblem test = new StringAlgorithmicProblem();
        System.out.println(test.getCount("aabcabcadkabkebfkabkskab", "abca"));
    }
    /**
     * 创建一个类似于trim()的方法
     */
    @Test
    public void test(){
        String s1 = "       uyiqrqwieuhrkalwej       ";
        int startIndex = 0;
        int endIndex = s1.length() - 1;
        char[] charArray = s1.toCharArray();
        boolean startFlag = true;
        boolean endFlag = true;
        while (true){
            if (startFlag) {
                if (charArray[startIndex] == ' ') {
                    startIndex++;
                }else {
                    startFlag = false;
                }
            }
            if (endFlag) {
                if (charArray[endIndex] == ' ') {
                    endIndex--;
                }else {
                    endFlag = false;
                }
            }
            if (!startFlag && !endFlag){
                break;
            }
        }

        String substring = s1.substring(startIndex, endIndex+1);
        System.out.println(substring);


    }

    /**
     * 对字符串进行反转
     */
    @Test
    public void test2(){
        String s1 = "owwwwierfoweeqhf";
        if (s1 != null) {
            char[] charArray = s1.toCharArray();
            for (int i = 0; i < charArray.length / 2; i++) {
                char temp = charArray[i];
                charArray[i] = charArray[charArray.length - 1 - i];
                charArray[charArray.length - i - 1] = temp;
            }

            s1 = String.valueOf(charArray);
        }
        System.out.println(s1);

    }

    /**
     * 字符串反转的另一种方法：
     * 要求，在指定区间内进行反转
     * 比如abcdefg，从2开始，在5结束，结果应该为abedcfg
     * 左闭右开区间
     */
    public String reverse(String str, int fromIndex, int toIndex){
        String start = str.substring(0, fromIndex);
        StringBuilder finalStr =  new StringBuilder(start);
        String end = str.substring(toIndex + 1);
        //从后往前循环，一个一个地加上
        //可以优化啊，先反转再加
//        for (int i = toIndex; i >= fromIndex ; i--) {
//            finalStr.append(str.charAt(i));
//        }
        //优化：
        return null;

    }

    //获取一个字符串在另一个字符串中出现的次数
    //比如获取"ab"在“aabcadkabkebfkabkskab”中出现的次数
    public int getCount(String mainStr, String subStr){
        if (mainStr == null || subStr == null || mainStr.length() < subStr.length()){
            return 0;
        }
        int count = 0;
        int index = 0;
        //indexOf()从指定索引开始从前往后找指定字符串
        while ((index = mainStr.indexOf(subStr, index)) != -1){
            //当可以找到时
            index++;
            count++;
        }
        return count;
    }
}
