package com.company.JavaCore.Level_8.Streams.TasksFileInAndOut;

/*
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ',' - 44.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должно выводится число запятых в считанном файле.
•	Поток чтения из файла должен быть закрыт.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        byte[] bytes = new byte[fileInputStream.available()];
        if(fileInputStream.available() > 0) {
            int read = fileInputStream.read(bytes);
        }

        int result = 0;

        for (int i = 0; i < bytes.length; i++) {
            if(bytes[i] == 44) {
                result++;
            }
        }

        fileInputStream.close();
        System.out.println(result);
    }
}
