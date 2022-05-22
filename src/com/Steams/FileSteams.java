package com.Steams;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileSteams {
    /*
    Для работы с файлами есть 2 потока: FileInputStream и FileOutputStream
    Оба потока работают с байтами.
    FileInputStream читает байты.
    FileOutputStream записывает байты.
     */
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\a.efremova\\Desktop\\DuelPromo.txt");
        // Создали объект класса FileInputStream
        // Передали в конструктор путь к файлу, из которого будем читать байты
        byte[] bytes = new byte[input.available()];

        for (int i = 0; i < bytes.length; i++) {
            while (input.available() > 0) {
                bytes[i] = (byte) input.read();
            }
        }

        for (int i = 0; i < bytes.length; i++) {
            System.out.print(i + " ");
        }

        input.close(); // после всех манипуляций закрываем поток

    }
}
