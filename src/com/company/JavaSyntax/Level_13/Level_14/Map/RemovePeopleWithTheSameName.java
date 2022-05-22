package com.company.JavaSyntax.Level_13.Level_14.Map;

/*
Создать словарь (Map) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
 */

import java.util.Map;

public class RemovePeopleWithTheSameName extends Helper{
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }


}
