package com.company.JavaCore.Level_3_InterfaceVSAbstractClass;

import java.io.*;

public class InputStreamVSOutputStream {
    public static void main(String[] args) throws IOException {
        /*
        2 интерфейса:
        InputStream - это интерфейс потока чтения, "из меня можно читать байты"
        OutputStream - это интерфейс потока записи, "в меня можно записывать байты"
        В Java есть понятие потока: поток для чтения и поток для записи
         */

        /*
        Для того чтобы читать данные из файла, есть специальный класс
        FileInputStream, который реализует интерфейс InputStream
         */

        // Вот так выглядит код копирования одного файла в другой
        InputStream inputStream = new FileInputStream("C:\\Users\\a.efremova\\Desktop\\test.txt");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\a.efremova\\Desktop\\test2.txt");

        while (inputStream.available() > 0) {
            int data = inputStream.read(); // читаем 1 байт из потока
            outputStream.write(data); // записываем прочитанный байт в другой поток
        }
        // закрываем потоки
        inputStream.close();
        outputStream.close();
    }
}
