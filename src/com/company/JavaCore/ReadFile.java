package com.company.JavaCore;

/*
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Требования:
•	Программа должна считывать c консоли путь к файлу.
•	Программа должна выводить на экран содержимое файла.
•	Поток чтения из файла (FileInputStream) должен быть закрыт.
•	BufferedReader также должен быть закрыт.

C:\\Users\\a.efremova\\Desktop\\test.txt
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String wayToFile = reader.readLine();

        InputStream inputStream = new FileInputStream(wayToFile);


        while (inputStream.available() > 0) {
            int data = inputStream.read();

        }
        inputStream.close();

        System.out.println();


    }
}
