package com.company.JavaCore.Level_8.Streams.TasksFileInAndOut;

/*
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должен выводиться минимальный байт, считанный из файла.
•	Поток чтения из файла должен быть закрыт.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinByte {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int min = fileInputStream.read();

        while (fileInputStream.available() > 0) {
            int curr = fileInputStream.read();
            if(curr <= min) {
                min = curr;
            }
        }
        System.out.println(min);
        fileInputStream.close();
    }
}
