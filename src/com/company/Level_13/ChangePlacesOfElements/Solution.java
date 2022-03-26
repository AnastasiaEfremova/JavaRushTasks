package com.company.Level_13.ChangePlacesOfElements;

/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
Примечание: - все числа и строки нужно вводить с клавиатуры с новой строки;
- запрещено создавать больше одного списка.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            strings.add(strings.remove(0));
        }

        System.out.println(strings);
    }
}
