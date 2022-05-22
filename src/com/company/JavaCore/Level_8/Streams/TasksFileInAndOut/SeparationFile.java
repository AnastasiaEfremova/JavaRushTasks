package com.company.JavaCore.Level_8.Streams.TasksFileInAndOut;

/*
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

C:\\Users\\a.efremova\\Desktop\\test1.txt
C:\\Users\\a.efremova\\Desktop\\test2.txt
C:\\Users\\a.efremova\\Desktop\\test3.txt

Требования:
•	Программа должна три раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
•	Первую половину байт из первого файла нужно записать во второй файл.
•	Вторую половину байт из первого файла нужно записать в третий файл.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */

import java.io.*;

public class SeparationFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
        byte[] buff = new byte[fileInputStream.available()];


        if(fileInputStream.available() > 0) {
            int a = fileInputStream.read(buff);
            if(buff.length % 2 == 0) {
                fileOutputStream1.write(buff, 0, buff.length / 2);
             fileOutputStream2.write(buff, buff.length / 2 , buff.length / 2);
             // off - индекс элемента, с которого начинается смещение
             // len - это количество элементов
            } else if(buff.length % 2 != 0) {
                fileOutputStream1.write(buff, 0, buff.length / 2 + 1);
              fileOutputStream2.write(buff, (buff.length / 2) + 1, buff.length / 2);
            }
        }
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
