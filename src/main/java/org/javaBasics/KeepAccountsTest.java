package org.javaBasics;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author cheng
 * @date 2023/10/16
 * @description 谷粒记账功能的实现
 */
public class KeepAccountsTest {

    @Test
    public void test() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal balance = new BigDecimal("0.0");
        ArrayList<IncomeExpenditureSituation> arrayList = new ArrayList<>();
        IncomeExpenditureSituation situation;
        while (true){
            System.out.println("---------------谷粒记账软件----------------");
            System.out.println("\n\t\t1 收支明细");
            System.out.println("\t\t2 登记收入");
            System.out.println("\t\t3 登记支出");
            System.out.println("\t\t4 退出");
            System.out.print("\n\t\t请选择（1-4）：");

            String input;
            input = verifyAndGetInput(scanner);
            switch (input){
                case "1":
                    System.out.println("--------------当前收支明细记录-------------");
                    System.out.println("收支\t\t账户余额\t\t收支金额\t\t说明");
                    for (IncomeExpenditureSituation s : arrayList) {
                        System.out.println(s.incomeExpenditure.getName() + "\t\t" + s.getBalance().toString() + "\t\t" + s.getMoney().toString() + "\t\t" + s.getDescription());
                    }
                    System.out.println("-----------------------------------------");
                    break;
                case "2":
                    System.out.print("本次收入金额：");
                    String incomeString = getIncomeOrExpenditure(scanner);
                    System.out.print("本次收入说明：");
                    balance = getAndSetBalance(incomeString, scanner, balance, arrayList, "1");
                    System.out.println("收入记录成功！");
                    break;
                case "3":
                    System.out.print("本次支出金额：");
                    String expendString = getIncomeOrExpenditure(scanner);
                    System.out.print("本次支出说明：");
                    balance = getAndSetBalance(expendString, scanner, balance, arrayList,"0");
                    System.out.println("支出记录成功！");
                    break;
                case "4":
                    String exitString;
                    do {
                        System.out.print("确认是否退出（Y/N）：");
                        exitString = scanner.next();
                    } while (!exitString.matches("[YyNn]"));
                    if ("Y".equals(exitString) || "y".equals(exitString)){
                        System.out.println("退出成功");
                        scanner.close();
                        return;
                    }
                     break;
                default:
                    throw new IllegalStateException("Unexpected value: " + input);
            }
        }

    }

    private static BigDecimal getAndSetBalance(String inputOrExpendString, Scanner scanner, BigDecimal balance, ArrayList<IncomeExpenditureSituation> arrayList, String whetherInputOrExpend) {
        IncomeExpenditureSituation situation;
        situation = new IncomeExpenditureSituation();
        situation.setMoney(BigDecimal.valueOf(Double.parseDouble(inputOrExpendString)));
        situation.setDescription(scanner.next());
        if ("0".equals(whetherInputOrExpend)) {
            balance = balance.subtract(situation.getMoney());
        }else {
            balance = balance.add(situation.getMoney());
        }
        situation.setBalance(balance);
        situation.setIncomeExpenditure(IncomeExpenditure.EXPENDITURE);
        arrayList.add(situation);
        return balance;
    }

   private static String verifyAndGetInput(Scanner scanner) {
        String input;
        while (true) {
             input = scanner.next();
            //判断输入的是否为1-4的数字
            if (!input.matches("[1-4]")) {
                System.out.print("输入错误，请重新输入：");
                continue;
            }
            break;
        }
        return input;
    }

    private static String getIncomeOrExpenditure(Scanner scanner) {
        String incomeString;
        while (true){
            incomeString = scanner.next();
            //验证是否是数字，包括小数
            if (!incomeString.matches("\\d+(\\.\\d+)?")) {
            System.out.print("输入错误，请重新输入：");
            }else {
                break;
            }
        }
        return incomeString;
    }
}

class IncomeExpenditureSituation{
    //收支情况
    public IncomeExpenditure incomeExpenditure;
    //余额
    public BigDecimal balance;
    //收支金额
    public BigDecimal money;
    //说明
    public String description;

    public IncomeExpenditureSituation(IncomeExpenditure incomeExpenditure, BigDecimal balance, BigDecimal money, String description) {
        this.incomeExpenditure = incomeExpenditure;
        this.balance = balance;
        this.money = money;
        this.description = description;
    }

    public IncomeExpenditureSituation() {
    }

    public IncomeExpenditure getIncomeExpenditure() {
        return incomeExpenditure;
    }

    public void setIncomeExpenditure(IncomeExpenditure incomeExpenditure) {
        this.incomeExpenditure = incomeExpenditure;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}