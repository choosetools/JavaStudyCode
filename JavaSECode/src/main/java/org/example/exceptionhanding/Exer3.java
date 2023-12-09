package org.example.exceptionhanding;

import org.junit.Test;

/**
 * @ClassName: Exer3
 * @Package: org.example.exceptionhanding
 * @Author cheng
 * @Create 2023/12/5 18:41
 * @Description: TODO
 */
public class Exer3 {
    @Test
    public void test(){
        try {
            Person person = new Person("hu", -12);
        }catch (NoLifeValueException e){
            e.printStackTrace();
        }

        try {
            Person p = new Person();
            p.setLifeValue(89);
            p.setLifeValue(-10);
        }catch (NoLifeValueException e){
            e.printStackTrace();
        }
    }
}
