package com.LiveCod;

import java.util.ArrayList;

public class Helper {

    private static String[] parseArray(String string) {
        String[] result = string.split("[%*$]");
        return result;
    }

    public static ArrayList<Integer> toArrayList(String string) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String str : parseArray(string)) {
            numbers.add(Integer.parseInt(str));
        }
        return numbers;
    }
}

