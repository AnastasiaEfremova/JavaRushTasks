package com.company.JavaCore.Level_8.Streams;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ПотокиВводаВывода {
    /*
    Потоки ввода-вывода делятся на 4 категории:
    1) По направлению: потоки ввода и вывода
    2) Потоки делятся по типу данных: работают с байтами или работают с символами

    Работает с байтами:
    InputStream (ввод) и OutputStream (вывод)

    Работает с символами:
    Reader (ввод) и Writer (вывод)

    Если объект реализует интерфейс InputStream, значит он поддерживает
    последовательное чтение из него байтов

    Если объект реализует интерфейс OutputStream, значит он поддерживает
    последовательную запись в него байтов

    Если объект реализует интерфейс Reader, значит он поддерживает
    последовательное чтение из него символов (char)

    Если объект реализует интерфейс Writer, значит он поддерживает
    последовательную запись в него символов (char)

    System.in
    in - имя статической переменной класса System, тип которой InputStream

    System.out
    out - имя статической переменной класса System, тип которой PrintStream
    (наследник OutputStream) в классе System
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        // Обращаемся к классу System и переменной out, у которой вызываем метод println
        PrintStream console = System.out;
        // Сохранили поток вывода в консоль в отдельную переменную
        console.println("Hello"); // выводим строку
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        // Создали динамический массив байт в памяти
        PrintStream console2 = new PrintStream(stream);
        // Связали его с новым потоком вывода - объектов PrintStream
        console2.println("Hello"); // Выводим в поток строку
    }
}
