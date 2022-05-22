package com.company.JavaSyntax.Level_13.MinOrMaxFirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное

Проинициализируй поле strings в методе main.
Добавь в список strings 10 строчек с клавиатуры.
Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(reader.readLine());
        }

        int biggestLength = list.get(0).length();
        int shortestLength = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i).length();
            if(j >= biggestLength) {
                biggestLength = j;
            }
            if(j <= shortestLength) {
                shortestLength = j;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i).length();
            if(j == biggestLength) {
                System.out.println(list.get(i));
                return;
            } else if(j == shortestLength) {
                System.out.println(list.get(i));
                return;
            }
        }
    }
}
