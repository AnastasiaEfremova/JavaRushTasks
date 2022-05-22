package com.company.JavaSyntax.Level_13.Level_14;

/*
Больше 10? Вы нам не подходите.
Создать множество чисел(Set), занести туда 10 различных чисел.
Удалить из множества все числа больше 10.
 */

import java.util.HashSet;
import java.util.Set;

public class MoreThanTen {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(22);
        set.add(33);
        set.add(5);
        set.add(4);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(5555);
        set.add(1);

        Set<Integer> set2 = deleteNumbersGreaterThan10(set);
        System.out.println(set2);
    }

    public static Set<Integer> deleteNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>();
        for (int x : set) {
            if (x < 10) {
                copy.add(x);
            }
        }
        return copy;
    }
}
