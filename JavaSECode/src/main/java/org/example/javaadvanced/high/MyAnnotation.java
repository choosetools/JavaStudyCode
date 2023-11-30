package org.example.javaadvanced.high;

import java.lang.annotation.*;

/**
 * @ClassName: MyAnnotation
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/29 20:39
 * @Description: TODO
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    public String value() default "cheng";
}
