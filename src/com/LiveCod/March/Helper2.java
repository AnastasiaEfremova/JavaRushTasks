package com.LiveCod.March;

import java.util.Map;

/*
2) Убрать реализацию в отдельный класс Helper,
с учетом модификаторов доступа и сделать метод универсальным (передавать любой возраст и сотрудника).
 */
class Helper2 {
    public static void returnWorkersWithSomeAgeAndSomePosition(Map<Integer, Person> map, int age, String position) {

        for (Map.Entry<Integer, Person> pair : map.entrySet()) {
            int personAge = pair.getValue().getAge();
            String personPosition = pair.getValue().getPosition();
            if(personAge < age && personPosition.equals(position)) {
                System.out.println(pair.getKey() + " - " + pair.getValue().toString());
            }
        }
    }
}

