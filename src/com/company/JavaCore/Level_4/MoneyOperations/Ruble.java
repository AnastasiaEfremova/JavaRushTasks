package com.company.JavaCore.Level_4.MoneyOperations;

public class Ruble extends Money {

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
