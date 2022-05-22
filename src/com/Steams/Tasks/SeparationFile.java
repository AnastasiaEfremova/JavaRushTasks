package com.Steams.Tasks;

/*
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

Требования:
•	Программа должна три раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
•	Первую половину байт из первого файла нужно записать во второй файл.
•	Вторую половину байт из первого файла нужно записать в третий файл.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SeparationFile {
    public static void main(String[] args) throws IOException {
        String file1 = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test1.txt";
        String file2 = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test2.txt";
        String file3 = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test3.txt";

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        FileOutputStream outputStream3 = new FileOutputStream(file3);

        int b = inputStream.available();
        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
        }

        if (buffer.length % 2 == 0) {
            outputStream2.write(buffer, 0, buffer.length / 2);
            outputStream3.write(buffer, buffer.length / 2, buffer.length / 2);
            // off - индекс элемента, с которого начинается смещение
            // len - это количество элементов
        } else {
            outputStream2.write(buffer, 0, buffer.length / 2 + 1);
            outputStream3.write(buffer, buffer.length / 2 + 1, buffer.length / 2);
        }
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
