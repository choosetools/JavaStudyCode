package org.example.javaadvanced.high;

import org.junit.Test;

/**
 * @ClassName: Developer
 * @Package: org.example.javaadvanced.high
 * @Author cheng
 * @Create 2023/11/25 23:01
 * @Description: TODO
 */
class Developer {
    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}
abstract class Vehicle{
    private String brand;
    private String color;
    Vehicle(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void run();
}
interface IPower{
    public abstract void power();
}
class Bycicle extends Vehicle{

    public Bycicle(String brand, String color){
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("骑自行车");
    }
}

class ElectricVehicle extends Vehicle implements IPower{

    public ElectricVehicle(String brand, String color){
        super(brand, color);
    }
    @Override
    public void run() {
        System.out.println("骑雅迪电动车");
    }

    @Override
    public void power() {
        System.out.println("充电");
    }
}
class Car extends Vehicle implements IPower{

    private String carNumber;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Car(String brand, String color, String carNumber){
        super(brand, color);
        this.carNumber = carNumber;
    }
    @Override
    public void run() {
        System.out.println("开车去");
    }

    @Override
    public void power() {
        System.out.println("加油");
    }
}

public class DeveloperTest{
    @Test
    public void test(){
        Developer developer = new Developer("程嘉伟", 22);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bycicle("捷安特", "黑色");
        vehicles[1] = new ElectricVehicle("雅迪","黄色");
        vehicles[2] = new Car("奔驰","红色","E3");
        for (Vehicle vehicle : vehicles) {
            developer.takingVehicle(vehicle);
        }
    }
}