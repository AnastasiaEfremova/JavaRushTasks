package com.Steams.Tasks;

/*
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RarelyRepeatBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        findRarelyRepeatBytes(fileName);

    }

    public static ArrayList<Integer> findRarelyRepeatBytes(String fileName) throws IOException {
        FileInputStream input = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (input.available() > 0) {
            list.add(input.read());
        }

        Collections.sort(list);

        int rarelyRepeat = 256;

        for (int x : list) {
            int y = Collections.frequency(list, x);
            if(y <= rarelyRepeat) {
                rarelyRepeat = y;
            }
        }

        for (int x : list) {
            int y = Collections.frequency(list, x);
            if(y == rarelyRepeat) {
                result.add(x);
                System.out.print(x + " ");
            }
        }

        return result;
    }
}
