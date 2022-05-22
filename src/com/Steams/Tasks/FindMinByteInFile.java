package com.Steams.Tasks;

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

public class FindMinByteInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream input = new FileInputStream(fileName);
        int min = input.read();

        while (input.available() > 0) {
            int x = input.read();
            if(x < min) {
                min = x;
            }
        }
        System.out.println("Самый маленький байт в этом файле " + min);
        input.close();
    }
}
