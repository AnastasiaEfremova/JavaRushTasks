package com.company.JavaSyntax.Level_13.DoubleWords;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удвой слова

Введи с клавиатуры 5 слов в список строк.
Метод doubleValues должен удваивать слова по принципу
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
Выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String x: result) {
            System.out.println(x);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String x: list) {
            result.add(x);
            result.add(x);
        }
        return result;
    }
}
