package com.Steams.Tasks;

/*
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

Требования:
•	Программа должна два раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
•	Во второй файл нужно записать все байты из первого в обратном порядке.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReversFile {
    public static void main(String[] args) throws IOException {
        String file1 = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test1.txt";
        String file2 = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test2.txt";

        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }

        Collections.reverse(list);

        for (int x : list) {
            fileOutputStream.write(x);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
