package com.Steams;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PracticWithSteams {
    public static void main(String[] args) {
        InputStream in = System.in;
        // in - это статическая переменная типа InputStream
        // in - переменная класса System
        // Мы обращаемся к это переменной через имя класса - System
        PrintStream out = System.out;
        // out - это статическая переменная типа PrintStream (наследник OutputStream)
        // out - переменная класса System
        // Аналогично обращаемся к это переменной через имя класса - System
        out.println("Hello");
        // Сохранили поток вывода в отдельную переменную,
        // а потом у этой переменной вызвали метод
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        // Создали динамический массив байт в памяти
        PrintStream console = new PrintStream(stream);
        // Связали его с новым потоком вывода
        console.println("Hello"); // Выводим поток в консоль

    }
}
