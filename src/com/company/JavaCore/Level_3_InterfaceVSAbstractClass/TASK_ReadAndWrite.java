package com.company.JavaCore.Level_3_InterfaceVSAbstractClass;

/*
C:\\Users\\a.efremova\\Desktop\\test.txt
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 */

import java.io.*;
import java.util.ArrayList;

public class TASK_ReadAndWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String wayToFile = bufferedReader.readLine();
        InputStream inputStream = new FileInputStream(wayToFile);
        String result = "";

        while (inputStream.available() > 0) {
            int data = inputStream.read();

        }
        System.out.println(result);
    }
}
