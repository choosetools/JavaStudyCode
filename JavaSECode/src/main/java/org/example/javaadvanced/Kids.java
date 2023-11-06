package org.example.javaadvanced;

/**
 * @ClassName: Kids
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/11/5 10:13
 * @Description: TODO
 */
public class Kids extends ManKind{
    private int yearsOld;
    public void printAge(){
        System.out.println(yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
