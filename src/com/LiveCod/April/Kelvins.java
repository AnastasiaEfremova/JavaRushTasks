package com.LiveCod.April;

public class Kelvins  implements Conversation {

    @Override
    public String convert(double degree) {
        double x = degree * 273.15;
        return degree + " градусов " + " - это " + x + " Кельвин.";
    }
}
