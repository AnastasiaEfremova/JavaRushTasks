package com.Steams.Tasks;

/*
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ',' - 44

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должно выводится число запятых в считанном файле.
•	Поток чтения из файла должен быть закрыт.
 */

import java.io.FileInputStream;
import java.io.IOException;

public class CheckCommons {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test1.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[fileInputStream.available()];
        
        if(fileInputStream.available() > 0) {
            int read = fileInputStream.read(buffer);
        }

        int result = 0;

        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == 44) {
                result++;
            }
        }
        System.out.println(result);
    }
}
