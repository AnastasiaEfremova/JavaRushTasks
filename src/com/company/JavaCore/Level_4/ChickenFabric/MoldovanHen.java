package com.company.JavaCore.Level_4.ChickenFabric;

public class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription() {
        return "Моя страна - Молдова. Я несу" + getCountOfEggsPerMonth() + "яиц в месяц.";
    }
}
