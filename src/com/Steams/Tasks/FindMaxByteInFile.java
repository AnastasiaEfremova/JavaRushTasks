package com.Steams.Tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должен выводиться максимальный байт, считанный из файла.
•	Поток чтения из файла должен быть закрыт.
 */
public class FindMaxByteInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream input = new FileInputStream(fileName);
        int max = 0;

        while (input.available() > 0) {
            int x = input.read();
            System.out.print(x + " ");
            if(x > max) {
                max = x;
            }
        }
        System.out.println();
        System.out.println("Самый максимальный байт в файле " + max);
        input.close();


    }
}
