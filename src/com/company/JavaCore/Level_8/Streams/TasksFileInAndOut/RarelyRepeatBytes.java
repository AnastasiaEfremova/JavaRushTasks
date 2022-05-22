package com.company.JavaCore.Level_8.Streams.TasksFileInAndOut;

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
import java.util.List;

public class RarelyRepeatBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        List<Integer> bytes = new ArrayList<>();

        while (fileInputStream.available() > 1) {
            bytes.add(fileInputStream.read());
        }
        System.out.print(bytes);

        int rarelyCount = 1;

        for (int x : bytes) {
            int y = Collections.frequency(bytes, x);
            if(y <= rarelyCount) {
                rarelyCount = y;
            }
        }

        for (int x : bytes) {
            int y = Collections.frequency(bytes, x);
            if(rarelyCount == y) {
                System.out.println(x);
            }
        }
    }
}
