package org.example.exceptionhanding;

/**
 * @ClassName: NoLifeValueException
 * @Package: org.example.exceptionhanding
 * @Author cheng
 * @Create 2023/12/5 18:32
 * @Description: TODO
 */
public class NoLifeValueException extends RuntimeException{
    static final long serivalVersionUID = 12345678L;

    public NoLifeValueException(){}

    public NoLifeValueException(String message){
        super(message);
    }
}
