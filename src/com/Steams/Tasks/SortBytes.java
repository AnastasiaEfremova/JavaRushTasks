package com.Steams.Tasks;

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

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.

C:\\Users\\a.efremova\\Desktop\\DuelPromo.txt
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortBytes {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\a.efremova\\Desktop\\DuelPromo.txt";
        Set<Integer> set = new HashSet<>();
        FileInputStream input = new FileInputStream(fileName);

        while (input.available() > 0) {
            set.add(input.read());
        }

        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        System.out.println(result);
    }
}
