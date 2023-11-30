package org.example.javaadvanced.high;

import java.lang.annotation.*;

/**
 * @ClassName: Column
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/29 21:01
 * @Description: TODO
 */
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String columnName();
    String columnType();
}
