package com.company.JavaCore.Level_4.MoneyOperations;

public abstract class Money {
    private Double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public abstract String getCurrencyName();
}

