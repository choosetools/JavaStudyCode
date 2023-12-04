package org.example.exceptionhanding;

import org.junit.Test;

/**
 * @ClassName: ThrowTest
 * @Package: org.example.exceptionhanding
 * @Author cheng
 * @Create 2023/12/4 21:21
 * @Description: TODO
 */
public class ThrowTest {
    @Test
    public void test(){
        Student student = new Student();
        student.regist(-12);
    }
}
class Student {
    int id;

    public void regist(int id){
        if (id > 0){
            this.id = id;
        }else {
            //手动抛出异常类对象
            throw new RuntimeException("输入的id非法");
//            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        }
    }
}
