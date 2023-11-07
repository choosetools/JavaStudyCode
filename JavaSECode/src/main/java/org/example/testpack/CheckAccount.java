package org.example.testpack;

/**
 * @ClassName: CheckAccount
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/7 19:22
 * @Description: TODO
 */
public class CheckAccount extends Account{

    //可透支限额
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    //必须创建一个构造器去调用父类中的有参构造器
    //否则会因为自身的默认空参构造器调用父类中的空参构造器（未创建）而报错
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }


    /**
     * 重写的取款方法
     * @param ammount
     */
    @Override
    public void withdraw(double ammount){
        double balance = getBalance();
        if (ammount <= balance){
            setBalance(balance - ammount);
            System.out.println("取款成功！");
        }else {
            double overdraft = ammount - balance;
            if (this.overdraft >= overdraft){
                setBalance(0);
                setOverdraft(this.overdraft - overdraft);
            }else {
                System.out.println("超出可透支的限额！");
            }
        }
    }

    public void printOverdraft(){
        System.out.println("您的可透支额：" + this.overdraft);
    }
}
