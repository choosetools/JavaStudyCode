package org.example.javaadvanced.high;

/**
 * @Author cheng
 * @ClassName Employee
 * @Date 2023/11/20 22:19
 * @Version V1.0
 * @Description
 */
public abstract class Employee {
    private String name;
    private int id;
    private double salary;
    public abstract void work();

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
