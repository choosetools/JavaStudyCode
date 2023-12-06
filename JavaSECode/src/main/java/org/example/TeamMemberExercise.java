//package org.example;
//
///**
// * @Author cheng
// * @ClassName TeamMemberExercise
// * @Date 2023/12/6 10:32
// * @Version V1.0
// * @Description
// */
//public class TeamMemberExercise {
//    public static void main(String[] args) {
//
//    }
//}
//
//class Employee {
//    //公司成员
//    private static Employee[] companyMembers = new Employee[10];
//    private static Employee[] teamMembers
//
//    static {
//        companyMembers[0] = new Employee("马云",22,3000);
//        companyMembers[1] = new Employee("马化腾",32,18000, "架构师","FREE",15000,2000,"联想T4(6000.0)");
//        companyMembers[2] = new Employee("李彦宏",23,7000,"程序员","FREE",0,0,"戴尔（NEC17寸）");
//        companyMembers[3] = new Employee("刘强东",24,7300,"程序员","FREE",0,0,"戴尔（三星 17寸）");
//        companyMembers[4] = new Employee("雷军",28,10000,"设计师","FREE",5000,0,"佳能2900（激光）");
//        companyMembers[5] = new Employee("程嘉伟",23,9000,"程序员","FREE",0,0,"联想E14");
//        companyMembers[6] = new Employee("杨鑫",23,9000,"程序员","FREE",0,0,"联想E14");
//        companyMembers[7] = new Employee("波哥",30,13000,"设计师","FREE",0,0,"");
//        companyMembers[8] = new Employee("程哥",35,23000,"架构师","FREE",9000,2000,"苹果");
//
//        companyMembers[9] = new Employee("平哥",32,13000,"设计师","FREE",0,0,"");
//    }
//
//
//    public void majorFunction(){
//        printTeamMembers();
//        while (true){
//
//        }
//    }
//
//
//    public void printTeamMembers(){
//        System.out.println("-----------------------------------------优尚开发团队调度系统-------------------------------------");
//        System.out.println("ID \t\t 姓名 \t\t 年龄 \t\t 工资\t\t\t 职位 \t\t 状态 \t\t 奖金 \t\t    股票 \t\t 领用设备");
//        for (int i = 0; i < companyMembers.length; i++) {
//            System.out.println(companyMembers[i]);
//        }
//        System.out.println("----------------------------------------------------------------------------------------------");
//    }
//
//    private String name;
//
//    private String TId;
//
//    private static int TIdIndex = 0;
//
//    private static int idIndex = 0;
//    private int id;
//    private int age;
//    private double salary;
//    private Position position = Position.PROGRAMMER;
//    private EmployeeStatus status = EmployeeStatus.FREE;
//
//    private double bonus;
//    private int stock;
//    private String receivingEquipment;
//
//    public Employee(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.id = ++idIndex;
//    }
//
//    public Employee(){
//        this.id = ++idIndex;
//    }
//
//    public Employee(String name, int age, double salary, String position, String status, double bonus, int stock, String receivingEquipment) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.position = Position.getPositionByName(name);
//        this.status = EmployeeStatus.getStatusByName(status);
//        this.bonus = bonus;
//        this.stock = stock;
//        this.receivingEquipment = receivingEquipment;
//        this.id = idIndex + 1;
//        idIndex++;
//    }
//
//    public static Employee[] getCompanyMembers() {
//        return companyMembers;
//    }
//
//    public static void setCompanyMembers(Employee[] companyMembers) {
//        Employee.companyMembers = companyMembers;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public String getPosition() {
//        return position.name();
//    }
//
//    public void setPosition(String name) {
//        this.position = Position.getPositionByName(name);
//    }
//
//    public EmployeeStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(EmployeeStatus status) {
//        this.status = status;
//    }
//
//    public double getBonus() {
//        return bonus;
//    }
//
//    public void setBonus(double bonus) {
//        this.bonus = bonus;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//
//    public String getReceivingEquipment() {
//        return receivingEquipment;
//    }
//
//    public void setReceivingEquipment(String receivingEquipment) {
//        this.receivingEquipment = receivingEquipment;
//    }
//
//    @Override
//    public String toString() {
//        return id + "\t\t" + name + " \t\t " + age + " \t\t " + salary + " \t\t " + ((this.position != null) ? this.position.getName() : "") + " \t\t " + ((this.status != null) ? this.getStatus().getId() : "") + " \t\t " + ((this.bonus == 0) ? "    " : String.valueOf(this.bonus)) + "   \t    " + ((this.stock == 0) ? "    " : String.valueOf(this.stock)) + "  \t\t" + ((this.receivingEquipment == null) ? "    " : this.receivingEquipment);
//
//    }
//}