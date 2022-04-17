package com.LiveCod.March;

import com.LiveCod.March.Helper2;
import com.LiveCod.March.Person;

import java.util.HashMap;
import java.util.Map;

/*
Создать класс Person с информацией о человеке (имя, возраст, должность).
Создать HasMap (Номер сотрудника, Информация о человеке).
Вывести сотрудников-стажеров, возраст которых меньше 20 лет.
 */
public class Test3 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Ivan", "trainee", 19));
        map.put(2, new Person("Oleg", "boss", 45));
        map.put(3, new Person("Sergey", "manager", 19));
        map.put(4, new Person("Petr", "worker", 18));

        Helper2.returnWorkersWithSomeAgeAndSomePosition(map, 20, "trainee");

    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
