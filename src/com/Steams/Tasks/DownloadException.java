package com.Steams.Tasks;

/*
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.

Требования:
•	Программа должна считать имена файлов с консоли.
•	Для чтения из файлов используй поток FileInputStream.
•	Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
•	Программа должна завершиться исключением DownloadException.
•	Поток FileInputStream должен быть закрыт.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DownloadException {
    public static void main(String[] args) throws IOException, MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            FileInputStream inputStream = new FileInputStream(fileName);
            if(inputStream.available() < 1000) throw new MyException();
        }


    }
    public static class MyException extends Exception {

    }
}


