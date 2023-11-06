package org.example.javaadvanced;

/**
 * @ClassName: ManKind
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 10:11
 * @Description: TODO
 */
public class ManKind {
    private int sex;
    private int salary;

    public void manOrWoman(){
        System.out.println((sex == 1) ? "man" : "woman");
    }

    public void employeed(){
        System.out.println((salary == 0) ? "no job" : "job");
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
