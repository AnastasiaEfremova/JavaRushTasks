package com.company.JavaCore.Level_5.TemplatePattern;

public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        super.getRightCup();
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        super.putIngredient();
        System.out.println("Делаем молоко с пенкой");
    }

    @Override
    void pour() {
        super.pour();
        System.out.println("Заливаем кофе");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
