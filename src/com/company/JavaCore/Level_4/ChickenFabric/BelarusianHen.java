package com.company.JavaCore.Level_4.ChickenFabric;

public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription() {
        return "Моя страна - Беларусь. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
