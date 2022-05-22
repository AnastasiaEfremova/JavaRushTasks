package com.company.JavaCore.Level_6.Join;

/*
В методе main добавить в статический объект list 5 нитей.
Каждая нить должна быть новым объектом класса Thread,
работающим со своим объектом класса SpecialThread.

Требования:
•	В методе main создай 5 объектов типа SpecialThread.
•	В методе main создай 5 объектов типа Thread.
•	Добавь 5 разных нитей в список list.
•	Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
•	Класс SpecialThread изменять нельзя.
 */

import java.util.ArrayList;
import java.util.List;

public class TASK_ListAndThreads {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread first = new SpecialThread();
        SpecialThread second = new SpecialThread();
        SpecialThread three = new SpecialThread();
        SpecialThread four = new SpecialThread();
        SpecialThread five = new SpecialThread();

        list.add(new Thread(first));
        list.add(new Thread(second));
        list.add(new Thread(three));
        list.add(new Thread(four));
        list.add(new Thread(five));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

