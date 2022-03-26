package com.company.Level_13.RorL;

import java.util.ArrayList;

/* 
Р или Л

Создай список слов, заполни его самостоятельно.
Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р".
2.2. удваивать все слова, содержащие букву "л".
2.3. если слово содержит и букву "р", и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мама");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        /*
        ConcurrentModificationException - одновременное изменение коллекции во время перебора
        Лучше во время перебора коллекции не изменять ее
        Одновременная модификация объекта
         */
        ArrayList<String> result = new ArrayList<>();
        for (String x: strings) {
            if(x.contains("р") && x.contains("л")) {
                result.add(x);
            } else if(x.contains("р")) {
                continue;
            } else if(x.contains("л")) {
                result.add(x);
                result.add(x);
            } else
                result.add(x);
        }
        return result;
    }
}