package com.LiveCod.April;

import java.util.ArrayList;

/*
1) Напишите классы для конвертации из градусов по Цельсию
(в том числе и для цельсия) в Кельвины (Цельсия + 273.15),
Фаренгейты(1.8 * Цельсия + 32), и так далее.
У класса должен быть метод convert, который и делает конвертацию.

2) Написать метод для нахождения чисел Фибоначчи, первые два числа передаются в метод.
Используй ArrayList.
(передаваемые параметры: первое число, второе, количество чисел)
 */
public class Main {
    public static void main(String[] args) {
        Fahrenheits fahrenheits = new Fahrenheits();
        Kelvins kelvins = new Kelvins();
        Celsius celsius = new Celsius();
        double degree = 5;

        System.out.println(celsius.convert(degree));
        System.out.println(fahrenheits.convert(degree));
        System.out.println(kelvins.convert(degree));

        System.out.println(Fibonacci.findNumbersOfFibonacci(1,2,13));



    }
}

