package com.company.JavaCore.Level_4.ChickenFabric;

public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return "Моя страна - Россия. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
