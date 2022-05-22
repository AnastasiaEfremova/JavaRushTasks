package com.company.JavaSyntax.Level_13.TheShortestLine;

/*
Самая короткая строка

Создай список строк.
Считай с клавиатуры 5 строк и добавь в список.
Используя цикл, найди самую короткую строку в списке.
Выведи найденную строку на экран.
Если таких строк несколько, выведи каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int shortestLength = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i).length();
            if(j <= shortestLength) {
                shortestLength = j;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == shortestLength) {
                System.out.println(list.get(i));
            }
        }
    }
}
