package com.company.JavaSyntax.Level_13.Level_14.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Helper {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Петр");
        map.put("Семин", "Семен");
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Иван");
        map.put("Смирнов", "Алексей");
        map.put("Шарипов", "Денис");
        map.put("Суворов", "Александр");
        map.put("Тополев", "Сергей");
        map.put("Трубов", "Алексей");
        map.put("Волков", "Максим");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String x : map.values()) {
            if (x.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String x : map.keySet()) {
            if (x.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair :
                copy.entrySet()) {
            int x = Collections.frequency(map.values(), pair.getValue());
            if (x > 1) {
                removeMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if(pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
}
