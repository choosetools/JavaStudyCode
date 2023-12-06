package org.example.exceptionhanding;

/**
 * @Author cheng
 * @ClassName MyException
 * @Date 2023/12/5 9:40
 * @Version V1.0
 * @Description
 */
public class MyException extends Exception{
    public MyException(){

    }

    public MyException(String message){
        super(message);
    }
}
