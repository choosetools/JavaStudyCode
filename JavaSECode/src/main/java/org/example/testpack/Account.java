package org.example.testpack;

/**
 * @ClassName: Account
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/7 19:14
 * @Description: TODO
 */
public class Account {
    //账号id
    private int id;
    //余额
    private double balance;
    //年利率
    private double annualInterestRate;
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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

    /**
     * 返回月利率
     * @return 月利率
     */
    public double getMonthlyInterest(){
        return this.annualInterestRate / 12;
    }

    /**
     * 取款方法
     * @param ammount
     */
    public void withdraw(double ammount){
        if (this.balance < ammount){
            System.out.println("余额不足！");
        }else {
            this.balance -= ammount;
            System.out.println("取款成功！");
        }
        printBalance();
    }

    /**
     * 存款方法
     * @param ammount
     */
    public void deposit(double ammount){
        this.balance += ammount;
        System.out.println("存款成功！");
        printBalance();
    }

    /**
     * 打印余额
     */
    public void printBalance(){
        System.out.println("您的账户余额为：" + this.balance);
    }
}
