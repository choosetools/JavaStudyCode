package org.example.javaadvanced.high;

/**
 * @ClassName: Singleton
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/27 23:26
 * @Description: TODO
 */
public enum Singleton {
    YOURSELF("YOURSELF","你自己");
    private final String name;
    private final String nameTranslation;
    private Singleton(String name, String nameTranslation){
        this.name = name;
        this.nameTranslation = nameTranslation;
    }
}
