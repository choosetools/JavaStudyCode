package org.javaBasics;

/**
 * @author cheng
 * @date 2023/10/16
 * @description: 收入支出枚举类
 */
public enum IncomeExpenditure {
    INCOME("收入","income"),
    EXPENDITURE("支出","expenditure");

    private String name;
    private String type;

    private IncomeExpenditure(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
