package org.example.javabasics;

/**
 * @ClassName FieldTest
 * @Description TODO
 * @Author cheng
 * @Date 2023/10/25 10:33
 * @Version V1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setAge(18);
        employee1.setId(1001);
        employee1.setName("cheng");
        employee1.setSalary(7000);

        employee2.setId(1002);
        employee2.setAge(22);
        employee2.setSalary(18000);
        employee2.setName("jiaWei");

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
class Employee{
    public int id;

    public String name;

    public int age;

    public double salary;

    public MyDate birthday;

    public Employee(int id, String name, int age, double salary, MyDate birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class MyDate{
    public int year;
    public int month;
    public int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}