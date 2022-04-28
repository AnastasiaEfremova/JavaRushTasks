package com.LiveCod.April;

public class Celsius implements Conversation {

    @Override
    public String convert(double degree) {
        return degree + " градусов" + " - это " + degree + " градусов." ;
    }
}
