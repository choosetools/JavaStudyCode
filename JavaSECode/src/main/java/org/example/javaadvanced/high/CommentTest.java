package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @author cheng
 * @ClassName CommentTest
 * @date 2023/11/29 10:40
 * @version V1.0
 * @description 注解测试
 */
public class CommentTest {
    @Test
    public void test(){
        //抑制已弃用代码的警告
        @SuppressWarnings("deprecation")
        TestClass test = new TestClass();
    }


}

@Deprecated
class TestClass{
    @Deprecated
    public void method(){

    }
}
