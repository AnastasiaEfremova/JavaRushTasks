package com.company.JavaSyntax.Level_13.Level_14.Map;

/*
Создать словарь (Map) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 */

import java.util.Map;

public class PeopleWithTheSameName extends Helper{
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Иван"));
        System.out.println(getCountTheSameLastName(map, "Петров"));
    }
}
