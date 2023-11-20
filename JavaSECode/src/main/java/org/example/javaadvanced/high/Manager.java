package org.example.javaadvanced.high;

/**
 * @Author cheng
 * @ClassName Manager
 * @Date 2023/11/20 22:21
 * @Version V1.0
 * @Description
 */
public class Manager extends Employee{
    public static void main(String[] args) {

    }
    @Override
    public void work() {
        System.out.println("Manager要工作！");
    }

    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
