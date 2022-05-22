package com.company.JavaCore.Level_8.Streams.TasksFileInAndOut;

/*
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

C:\\Users\\a.efremova\\Desktop\\test1.txt
C:\\Users\\a.efremova\\Desktop\\test2.txt

Требования:
•	Программа должна два раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
•	Во второй файл нужно записать все байты из первого в обратном порядке.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */

import java.io.*;

public class ReverseFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] buff = new byte[fileInputStream.available()];

        if(fileInputStream.available() > 0) {
            int a = fileInputStream.read(buff);
        }

        byte[] reverse = new byte[buff.length];
        for (int i = 0; i < buff.length; i++) {
            reverse[i] = buff[buff.length - 1 - i];
        }

        fileOutputStream.write(reverse);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
