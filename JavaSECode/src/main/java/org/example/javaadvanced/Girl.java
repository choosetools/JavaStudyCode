package org.example.javaadvanced;

/**
 * @ClassName: Gril
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/10/29 22:52
 * @Description: TODO
 */
public class Girl {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想要嫁给" + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个Girl对象的大小
     * @param girl
     * @return 正数：当前对象大；负数：当前对象小；0：相等
     */
    public int compare(Girl girl){
        if (this.age > girl.age){
            return 1;
        }else if (this.age < girl.age){
            return -1;
        }else {
            return 0;
        }
    }
}
