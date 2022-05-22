package com.company.JavaSyntax.Level_13.DeleteLastStringAndPutItAtTheBegining;

/*
Удали последнюю строку и вставь её в начало

Создай список строк.
Добавь в него 5 строк с клавиатуры.
Выполни 13 раз: удалить последнюю строку и вставить её в начало.
Используя цикл, выведи содержимое результирующего списка на экран, каждое значение с новой строки.
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

        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(4));
        }

        for (String x: list) {
            System.out.println(x);
        }
    }
}
