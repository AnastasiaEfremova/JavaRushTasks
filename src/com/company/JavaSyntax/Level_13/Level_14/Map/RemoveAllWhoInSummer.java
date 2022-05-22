package com.company.JavaSyntax.Level_13.Level_14.Map;

/*
В словарь (Map<String, Date>) занести десять записей по принципу:
«фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RemoveAllWhoInSummer {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Диана", dateFormat.parse("JANUARY 1 2012"));
        map.put("Иван", dateFormat.parse("JUNE 1 2012"));
        map.put("Сергей", dateFormat.parse("JUNE 1 2012"));
        map.put("Петр", dateFormat.parse("JUNE 1 2012"));
        map.put("Анатолий", dateFormat.parse("JUNE 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {

        }

    }

    public static void main(String[] args) {

    }
}
