package com.company.JavaCore.Level_4.ChickenFabric;


public class Main {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            return switch (country) {
                case Country.RUSSIA -> hen = new RussianHen();
                case Country.UKRAINE -> hen = new UkrainianHen();
                case Country.BELARUS -> hen = new BelarusianHen();
                case Country.MOLDOVA -> hen = new MoldovanHen();
                default -> hen;
            };
        }

    }
}
