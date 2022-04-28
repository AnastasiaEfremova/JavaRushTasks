package com.LiveCod.April;

public class Fahrenheits implements Conversation {

    @Override
    public String convert(double degree) {
        double x = 1.8 * degree + 32 * degree;
        return degree + " градусов " + " - это " + x + " Фаренгейт.";
    }
}
