package com.company.JavaCore.Level_8.Streams;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput {
    /*
    FileInputStream - позволяет последовательно читать из файла байты
    FileOutputStream - позволяет последовательно записывать байты в файл

     */
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\a.efremova\\Desktop\\test.txt");
        /*
        Создали новый объект типа FileInputStream
        Указали в параметрах конструктора путь к файлу, из которого
        будем читать байты
         */
        // fileInputStream.read();
        // метод читает 1 байт из файла и результат расширяет до int
        // fileInputStream.available();
        // метод возвращает количество доступных непрочитанных байт
        // fileInputStream.close(); // закрывает поток

        /*
        Читаем из файла каждый отдельный байт
        Создаем цикл, в условии которого говорим следующее:
        пока еще есть непрочитанные байты - читаем
         */
        // можно также создать массив и записать байты туда
        List<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            int a = fileInputStream.read();
            list.add(a);
        }
        System.out.println(list);
        fileInputStream.close(); // закрываем поток
    }
}
