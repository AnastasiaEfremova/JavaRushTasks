package com.company.JavaSyntax.Level_13.ThreeArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Три массива

Введи с клавиатуры 20 чисел, сохрани их в список numbers и рассортируй по трём другим спискам:
число нацело делится на 3 (x%3==0) — попадает в список divBy3,
нацело делится на 2 (x%2==0) — попадает в divBy2,
и все остальные — попадают в others,
нацело делится на 3 и на 2 одновременно, например, 6, — попадает и в divBy3, и в divBy2.
Статические переменные списков уже созданны и инициализированы.
Метод printList() должен выводить на экран все элементы списка с новой строки.
Используя метод printList(), выведи экран: сначала список divBy3, потом divBy2, потом others.
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < numbers.size(); i++) {
            int j = numbers.get(i);
            if (j % 2 == 0 && j % 3 == 0) {
                divBy2.add(j);
                divBy3.add(j);
            } else if(j % 2 == 0) {
                divBy2.add(j);
            } else if(j % 3 == 0) {
                divBy3.add(j);
            } else
                others.add(j);
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
//        for (Integer x : list) {
//            System.out.println(x);
        System.out.println(list);
        }
    }

