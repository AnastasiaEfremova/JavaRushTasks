package com.YouTube;

import java.util.Date;

public class DateLesson {
    public static void main(String[] args) {
        Date date = new Date(); // не используется на проектах
        // время исчисляется в миллисекундах с 1970
        System.out.println(date); // Sat Mar 26 18:22:48 MSK 2022
        // что, если мы хотим изменить год
        date.setYear(119);
        date.setMonth(0);
        // метод перечеркнут, потому что он устаревший и обозначен
        // аннотацией @deprecated


    }
}
