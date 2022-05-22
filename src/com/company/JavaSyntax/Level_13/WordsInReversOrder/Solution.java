package com.company.JavaSyntax.Level_13.WordsInReversOrder;

/*
Слова в обратном порядке

Введи с клавиатуры 5 слов в список строк.
Удали 3-й элемент списка и выведи оставшиеся элементы в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        list.remove(2);
        Collections.reverse(list);
        System.out.println(list);
    }
}
