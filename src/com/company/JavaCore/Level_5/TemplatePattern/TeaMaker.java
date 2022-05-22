package com.company.JavaCore.Level_5.TemplatePattern;

public class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        super.getRightCup();
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        super.putIngredient();
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        super.pour();
        System.out.println("Заливаем кипятком");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
