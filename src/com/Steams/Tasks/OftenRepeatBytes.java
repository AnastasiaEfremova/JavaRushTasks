package com.Steams.Tasks;

/*
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OftenRepeatBytes {
    public static void main(String[] args) throws IOException {
        System.out.println(findOftenRepeatBytesInFile("C:\\Users\\a.efremova\\Desktop\\DuelPromo.txt"));

    }

    public static List<Integer> findOftenRepeatBytesInFile(String fileName) throws IOException {
        FileInputStream input = new FileInputStream(fileName);
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> oftenRepeatButes = new ArrayList<>();

        while (input.available() > 0) {
            result.add(input.read());
        }

        Collections.sort(result);

        int maxCountOfRepeat = 0;
        for (int x : result) {
            int count = Collections.frequency(result, x);
            if (maxCountOfRepeat < count) {
                maxCountOfRepeat = count;
            }
        }

        for (int x : result) {
            int count = Collections.frequency(result, x);
            if (count == maxCountOfRepeat) {
                oftenRepeatButes.add(x);
            }
        }
        return oftenRepeatButes;
    }
}
