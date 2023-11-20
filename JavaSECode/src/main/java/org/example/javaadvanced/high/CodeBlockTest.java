package org.example.javaadvanced.high;


import org.junit.Test;

/**
 * @Author cheng
 * @ClassName CodeBlockTest
 * @Date 2023/11/19 9:20
 * @Version V1.0
 * @Description 代码块测试
 */
public class CodeBlockTest {
    @Test
    public void test(){
        CodeBlock codeBlock1 = new CodeBlock();
        System.out.println("************************************");
        CodeBlock codeBlock2 = new CodeBlock();
    }

}
class CodeBlock{
    private static int age = 1;
    private String name = "cheng";

    static {
        System.out.println("静态代码块1，age = " + CodeBlock.age);
    }
    static {
        System.out.println("静态代码块2");
    }

    public CodeBlock(){
        age = 2;
        this.name = "jia";
    }
    {
        System.out.println("非静态代码块1，name = " + this.name);
    }

    {
        System.out.println("非静态代码块2");
    }
}
