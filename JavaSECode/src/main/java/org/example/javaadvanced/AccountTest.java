package org.example.javaadvanced;

import org.junit.Test;

/**
 * @ClassName: AccountTest
 * @Package: org.example.javaadvance
 * @Author cheng
 * @Create 2023/10/29 11:12
 * @Description: TODO
 */
public class AccountTest {
    @Test
    public void test(){
        Customer customer = new Customer("Jane","Smith");
        customer.setAccount(new Account(1000, 2000, 0.0123));
        Account account = customer.getAccount();
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        System.out.println(customer);
    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int i, double b, double a){
        this.annualInterestRate = a;
        this.id = i;
        this.balance = b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("余额不足，取款失败");
        }else {
            this.balance -= amount;
            System.out.println("成功取出：" + amount);
        }
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("成功存入：" + amount);
    }
}
class  Customer{
    private String firstName;
    private String lastName;
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;

    }

    public String toString(){
        return  "Customer [" + this.firstName + ", " + this.lastName + "] has a account: id is " + this.account.getId() + ", annualInterestRate is " + this.account.getAnnualInterestRate() * 100 + "%, balance is " + this.account.getBalance();

    }
}
