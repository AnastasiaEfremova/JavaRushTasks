package com.company.JavaSyntax.Level_13.SortList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка списка

Введи с клавиатуры 10 слов в список строк.
Определить, является ли список упорядоченным по возрастанию длины строки.
В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
one
two
one
two
one
two
one
two
nineeeee
seven
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int length = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            int j = strings.get(i).length();
            if(j >= length) {
                length = j;
            } else if(j < length) {
                System.out.println(i);
                break;
            }
        }
    }
}

