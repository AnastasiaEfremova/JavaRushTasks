package com.company.JavaCore.Level_4.ChickenFabric;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return "Моя страна - Украина. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
