package org.example.javaadvanced;

/**
 * @ClassName: ThisKeywordTest
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/10/29 21:54
 * @Description: this关键字的使用
 */
public class ThisKeywordTest {
    public static int age = 1;
    int id = 2;
    public static void method(){
    }

}
class ThisKeyword{
    String name;
    int age;


    ThisKeyword(String name, int age){

    }

    ThisKeyword(){

    }
    ThisKeyword(String name, int age, String email){
        this(email, age);

    }
}
