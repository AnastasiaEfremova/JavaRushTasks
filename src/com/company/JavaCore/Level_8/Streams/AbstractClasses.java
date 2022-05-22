package com.company.JavaCore.Level_8.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class AbstractClasses {
    /*
    На самом деле InputStream и OutputStream - это абстрактные классы
    У этих классов есть реализованные методы
     */
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\a.efremova\\Desktop\\test.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] r = new byte[256];

        while (fileInputStream.available() > 0) {
            fileInputStream.read(r); // метод сразу читает блок байт в буффер (массив байт)
            // может быть меньше длинны массива
        }

        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }

    }
}
