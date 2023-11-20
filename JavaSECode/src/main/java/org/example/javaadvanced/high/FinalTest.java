package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @Author cheng
 * @ClassName FinalTest
 * @Date 2023/11/19 19:58
 * @Version V1.0
 * @Description
 */
public class FinalTest {
    private final Father father = new Father("cheng");
    @Test
    public void test(){
        father.name = "jia";
//        father = new Father("wei");报错
    }
}

final class FatherTest{

}
//class SubTest extends FatherTest{
//
//}


