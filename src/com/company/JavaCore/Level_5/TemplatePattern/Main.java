package com.company.JavaCore.Level_5.TemplatePattern;

public class Main {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        LatteMaker latteMaker = new LatteMaker();
        teaMaker.makeDrink();
        latteMaker.makeDrink();
    }
}
