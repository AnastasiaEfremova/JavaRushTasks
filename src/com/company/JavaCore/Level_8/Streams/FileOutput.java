package com.company.JavaCore.Level_8.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
     /*
    FileInputStream - класс позволяет последовательно читать из файла байты
    FileOutputStream - класс позволяет последовательно записывать байты в файл

     */
     public static void main(String[] args) throws IOException {

         /*
         Создаем объект класса FileOutputStream и в параметрах
         конструктора указываем имя файла, в который созданный объект
         будет писать байты
          */
         // fileOutputStream.write(int data);
         // метод записывает 1 байт, сужая переменную data до байта
         // fileOutputStream.flush();
         // метод требует немедленно записать всю несохраненную инфу на диск
         // fileInputStream.close(); // закрывает поток

         // Копируем файл на диске
         FileInputStream fileInputStream = new FileInputStream("C:\\Users\\a.efremova\\Desktop\\test.txt");
         // Создали поток чтения байт из файла
         FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\a.efremova\\Desktop\\test2.txt");
         // Создали поток записи байт в файл

         while (fileInputStream.available() > 0) {
             // условие: пока еще есть непрочитанные байты
             int data = fileInputStream.read();
             // прочитали байт
             fileOutputStream.write(data);
             // записали байт
         }
         // закрываем потоки
         fileInputStream.close();
         fileOutputStream.close();
     }
}
