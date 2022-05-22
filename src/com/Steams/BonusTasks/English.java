package com.Steams.BonusTasks;

/*
В метод main первым параметром приходит путь к файлу.
Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
Вывести на экран число (количество символов).
Закрыть потоки.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток чтения из файла, который приходит первым параметром в main.
•	В файле необходимо посчитать количество символов, которые соответствуют буквам английского алфавита, и вывести это число в консоль.
•	Нужно учитывать заглавные и строчные буквы.
•	Поток чтения из файла должен быть закрыт.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class English {
    public static void main(String[] args) throws IOException {
        char[] ch = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
                , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        FileInputStream inputStream = new FileInputStream(args[0] = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test1.txt");
        int count = 0;
        while (inputStream.available() > 0) {
            int x = inputStream.read();
            char y = (char) x;
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < ch.length; j++) {
                    if(y == j) {
                        count++;
                    }
                }
            }
        }
    }
}

