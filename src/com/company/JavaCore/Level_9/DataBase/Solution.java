package com.company.JavaCore.Level_9.DataBase;

public class Solution {
    /*
    Давай представим ситуацию, что с одной стороны у нас есть некая база данных,
    в которой хранятся данные. База данных имеет стандартный набор команд (методов) для
    предоставления данных, они описаны в интерфейсе IncomeData.
    Примеры представления данных приведены в комментариях около каждого метода.
    С другой стороны есть пользователи, которые хотят получать данные из этой базы,
    но в каком-то другом (конкретном) формате.
    Запросы от пользователей представлены методами в интерфейсах Customer и Contact.
    Там же (в комментариях около каждого метода) есть примеры представления информации в том виде,
     в котором пользователи хотят ее получать из базы данных.

Твоя задача: написать логику класса адаптера IncomeDataAdapter,
который будет по запросам методов из интерфейсов Customer и Contact,
обращаться в базу (методы интерфейса IncomeData), получать данные, обрабатывать их,
при необходимости изменять представление, и возвращать в виде результата.

Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada

При необходимости дополни начало телефонного номера (без кода страны) нулями до 10 цифр
 (смотри примеры в комментарии к соответствующему методу).
 Обрати внимание на формат вывода телефона, фамилии и имени человека
 (смотри примеры в комментарии к соответствующему методу).

Требования:
•	Класс Solution должен содержать public static поле countries типа Map<String, String>.
•	В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
•	Класс IncomeDataAdapter должен реализовывать интерфейсы Customer и Contact.
•	Класс IncomeDataAdapter должен содержать приватное поле data типа IncomeData.
•	Класс IncomeDataAdapter должен содержать конструктор с параметром IncomeData.
•	В классе IncomeDataAdapter реализуй методы интерфейсов Customer и Contact
используя подсказки в виде комментариев в интерфейсах.
     */
}