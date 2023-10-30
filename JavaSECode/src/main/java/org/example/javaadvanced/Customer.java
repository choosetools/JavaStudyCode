package org.example.javaadvanced;

import java.util.Scanner;

/**
 * @ClassName: SecondProjectTest
 * @Package: org.example.javaadvanced
 * @Author cheng
 * @Create 2023/10/30 15:53
 * @Description: TODO
 */
public class Customer {
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private char gender;

    private int age;

    private String phone;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return this.getId() + "\t" + this.getName() + "\t" + this.getGender() + "\t" + this.getAge() + "\t" + this.getPhone() + "\t" + this.getEmail();
    }
}

/**
 * @Author cheng
 * @Create 2023/10/30 15:53
 * @Description:
 */
class CustomerList {
    //用户数组
    private Customer[] customers = new Customer[0];

    //遍历


    public Customer getCustomer(int index) {
        if (customers != null && (customers.length >= index + 1)) {
            return customers[index];
        } else {
            return null;
        }
    }

    public int getTotal() {
        return customers.length;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    //删除，传入用户数组的索引值
    public void deleteCustomer(int index) {
        //判断原本是否有数据，如果没有
        if (this.customers == null || this.customers.length == 0) {
            this.customers = new Customer[0];
            return;
        } else {
            //原本有数据
            Customer[] newCustomers = new Customer[this.customers.length - 1];
            for (int i = 0; i < newCustomers.length; i++) {
                if (i < index) {
                    newCustomers[i] = this.customers[i];
                } else {
                    newCustomers[i] = this.customers[i + 1];
                }
            }
            this.customers = newCustomers;
        }

    }

    //修改
    public void setCustomer(Customer customer, int index) {
        this.customers[index] = customer;
    }

    //添加，添加后是将原本的数据
    public void addCustomer(Customer customer) {
        if (customers != null && customers.length > 0) {
            Customer[] newCustomers = new Customer[customers.length + 1];
            for (int i = 0; i < newCustomers.length; i++) {
                if (i == (newCustomers.length - 1)) {
                    newCustomers[i] = customer;
                } else {
                    newCustomers[i] = customers[i];
                }
            }
            this.customers = newCustomers;
        } else {
            //如果原本数组中没有数据，那么直接创建一个加入即可
            this.customers = new Customer[1];
            customers[0] = customer;
        }

    }

}

class CustomerView {

    CustomerList customerList = new CustomerList();

    public void enterMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("-------------拼电商客户管理系统---------------");
            System.out.println("\t\t\t\t1.添加客户\t\t");
            System.out.println("\t\t\t\t2.修改客户\t\t");
            System.out.println("\t\t\t\t3.删除客户\t\t");
            System.out.println("\t\t\t\t4.查询客户\t\t");
            System.out.println("\t\t\t\t5.退出系统\t\t");
            System.out.print("\t\t\t\t请选择（1-5）：");
            String s = scanner.nextLine();
            //判断是否是数字，并且数字在1-5以内
            while (!s.matches("[1-5]")) {
                System.out.println("请输入正确的数字：");
                s = scanner.nextLine();
            }
            int i = Integer.parseInt(s);
            switch (i) {
                case 1:
                    addNewCustomer(scanner);
                    break;
                case 2:
                    modifyCustomer(scanner);
                    break;
                case 3:
                    deleteCustomer(scanner);
                    break;
                case 4:
                    isAllCustomers();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
        scanner.close();
    }

    private void addNewCustomer(Scanner scanner) {
        Customer customer = new Customer();
        System.out.println("---------------添加客户----------------------");
        System.out.print("姓名：");
        inputMessage(customer, scanner, 1, 1);
        System.out.print("性别：");
        inputMessage(customer, scanner, 2, 1);
        System.out.print("年龄：");
        inputMessage(customer, scanner, 3, 1);
        System.out.print("电话：");
        inputMessage(customer, scanner, 4, 1);
        System.out.print("邮箱：");
        inputMessage(customer, scanner, 5, 1);
        //设置id值
        customer.setId(customerList.getCustomers().length + 1);
        customerList.addCustomer(customer);
        System.out.println("---------------添加完成----------------------");
    }

    private void modifyCustomer(Scanner scanner) {
        System.out.println("---------------修改客户----------------------");
        System.out.print("请选择待修改客户编号（-1退出）：");
        Customer customer = getCustomerByInput(scanner);
        if (customer != null) {
            int id = customer.getId();
            System.out.print("姓名（" + customer.getName() + "）：");
            inputMessage(customer, scanner, 1, 2);
            System.out.print("性别（" + customer.getGender() + "）：");
            inputMessage(customer, scanner, 2, 2);
            System.out.print("年龄（" + customer.getAge() + "）：");
            inputMessage(customer, scanner, 3, 2);
            System.out.print("电话（" + customer.getPhone() + "）：");
            inputMessage(customer, scanner, 4, 2);
            System.out.print("邮箱（" + customer.getEmail() + "）：");
            inputMessage(customer, scanner, 5, 2);
            customerList.setCustomer(customer, id - 1);
            System.out.println("---------------修改完成----------------------");
        }
    }





    private void deleteCustomer(Scanner scanner) {
        System.out.println("---------------删除客户----------------------");
        System.out.print("请选择待删除客户编号（-1退出）：");
        Customer customer = getCustomerByInput(scanner);
        if (customer != null) {
            System.out.print("确认是否删除（Y/N）：");
            String whetherDel;
            while (true) {
                whetherDel = scanner.nextLine();
                //判断是否输入的是y或n（可以为大写）
                if ("Y".equals(whetherDel) || "N".equals(whetherDel) || "y".equals(whetherDel) || "n".equals(whetherDel)) {
                    break;
                } else {
                    System.out.print("请输入Y或N：");
                }
            }
            if ("Y".equals(whetherDel) || "y".equals(whetherDel)) {
                customerList.deleteCustomer(customer.getId() - 1);
                System.out.println("---------------删除完成----------------------");
            }
        }
    }

    private void isAllCustomers() {
        System.out.println("---------------客户列表----------------------");
        System.out.println("编号\t姓名\t\t性别\t年龄\t电话\t\t\t邮箱");
        for (Customer customer : customerList.getCustomers()) {
            System.out.println(customer);
        }
        System.out.println("---------------客户列表完成----------------------");
    }

    private Customer getCustomerByInput(Scanner scanner) {
        String idString = scanner.nextLine();
        Customer customer;
        if (!"-1".equals(idString)) {
            while (true) {
                idString = scanner.nextLine();
                //如果id不为一串数字
                if (!idString.matches("^[0-9]+$")) {
                    System.out.print("输入有误，请重新输入用户编号：");
                } else {
                    int id = Integer.parseInt(idString);
                    customer = customerList.getCustomer(id - 1);
                    if (customer != null) {
                        break;
                    } else {
                        System.out.print("不存在该用户编号，请重新输入：");
                    }
                }
            }
            return customer;
        }
        return null;
    }

    //用于循环地输入信息，如果输入的信息不符合要求，则进行重新输入
    //1表示姓名，2表示性别，3表示年龄，4表示电话，5表示邮箱
    //该方法用于增加与修改，增加的话modifyType为1，修改为2
    private void inputMessage(Customer customer, Scanner scanner, int infoCategory, int modifyType) {
        String info;
        boolean flag = true;
        while (flag) {
            info = scanner.nextLine();
            char r = '\r';
            switch (infoCategory) {
                case 1:
                    if (modifyType != 2 || info.charAt(0) != r) {
                        customer.setName(info);
                    }
                    flag = false;
                    break;
                case 2:
                    if (modifyType == 2 && info.charAt(0) == r) {
                        flag = false;
                    } else {
                        if (!"男".equals(info) && !"女".equals(info)) {
                            System.out.print("输入的性别有误，请重新输入（男或女）：");
                        } else {
                            customer.setGender(info.charAt(0));
                            flag = false;
                        }
                    }
                    break;
                case 3:
                    if (modifyType == 2 && info.charAt(0) == r) {
                        flag = false;
                    } else {
                        if (info.matches("^[0-9]*[1-9][0-9]*$")) {
                            int age = Integer.parseInt(info);
                            if (age < 120 && age > 0) {
                                customer.setAge(age);
                                flag = false;
                                break;
                            }
                        }
                        System.out.print("输入的年龄有误，请重新输入（1-120）：");
                    }
                    break;
                case 4:
                    if (modifyType == 2 && info.charAt(0) == r) {
                        flag = false;
                    } else {
                        if (!info.matches("^1[3-9]\\d{9}$")) {
                            System.out.print("输入的电话有误，请输入正确的电话：");
                        } else {
                            customer.setPhone(info);
                            flag = false;
                        }
                    }
                    break;
                case 5:
                    if (modifyType == 2 && info.charAt(0) == r) {
                        flag = false;
                    } else {
                        if (!info.matches( "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")) {
                            System.out.print("输入的邮箱有误，请输入正确的邮箱格式：");
                        } else {
                            customer.setEmail(info);
                            flag = false;
                        }
                    }
                    break;
            }
        }

    }
}
