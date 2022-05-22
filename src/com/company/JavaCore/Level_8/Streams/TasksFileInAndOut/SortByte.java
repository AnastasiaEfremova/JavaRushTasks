package com.company.JavaCore.Level_8.Streams.TasksFileInAndOut;

/*
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83

C:\\Users\\a.efremova\\Desktop\\test.txt
Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortByte {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        Set<Integer> list = new HashSet<>();

        while (fileInputStream.available() > 1) {
            list.add(fileInputStream.read());
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : list) {
            result.add(x);
        }
        Collections.sort(result);
        fileInputStream.close();

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
