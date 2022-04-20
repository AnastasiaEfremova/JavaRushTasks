package com.company.JavaCore.Level_4.MoneyOperations;

public class Hryvnia extends Money {

    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
