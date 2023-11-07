package org.example.testpack;

/**
 * @ClassName: AccountTest
 * @Package: org.example.testpack
 * @Author cheng
 * @Create 2023/11/7 19:29
 * @Description: TODO
 */
public class AccountTest {
    public static void main(String[] args) {
        CheckAccount account = new CheckAccount(1122,20000,0.045,5000);
        account.withdraw(5000);
        account.printBalance();
        account.printOverdraft();

        account.withdraw(18000);
        account.printBalance();
        account.printOverdraft();

        account.withdraw(3000);
        account.printBalance();
        account.printOverdraft();

    }
}
