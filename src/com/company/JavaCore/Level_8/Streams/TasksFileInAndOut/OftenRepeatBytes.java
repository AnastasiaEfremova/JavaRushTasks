package com.company.JavaCore.Level_8.Streams.TasksFileInAndOut;

/*
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
C:\\Users\\a.efremova\\Desktop\\test.txt

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
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

public class OftenRepeatBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        List<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }

        int maxCount = 0;

        for (int i = 0; i < list.size(); i++) {
            int y = list.get(i);
            int result = Collections.frequency(list, y);
            if (result > maxCount) {
                maxCount = result;
            }

        }

        for (int x : list) {
            int result = Collections.frequency(list, x);
            if(maxCount == result) {
                System.out.print(x + " ");
            }
        }

        fileInputStream.close();
    }
}
