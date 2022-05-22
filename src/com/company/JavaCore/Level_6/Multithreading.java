package com.company.JavaCore.Level_6;

public class Multithreading {
    /*
    Многопоточность или многонитевость
    Нить - это поток команд, выполненных во время определенного процесса
    Чтобы создать новую нить, нужно:
    1) Создать объект класса Thread (нить)
    2) Передать в него объект, метод которого нужно выполнить
    3) Вызвать у созданного объекта Thread метод Start
    Пример:
     */
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
        childThread.start();
    }

    static class Printer implements Runnable {
        @Override
        public void run() {
            System.out.println("I'm printer");
        }
    }
    /*
    Маленькие программы в Java обычно состоят из 1 нити - Main Thread
    Большие программы включают в себя еще дочерние нити
    Чтобы указать с какого метода нужно начать выполнение,
    объекту Thread нужно как-то об это сообщить
    Для этого есть интерфейс Runnable
    Интерфейс содержит единственный метод void run()
    В классе Thread есть конструктор Thread(Runnable runnable),
    в который можно передать объект, который реализует интерфейс Runnable
    Нужно унаследовать интерфейс Runnable в классе
    Затем переопределить метод void run()
    Именно с этого метода начинается работа любой нити
     методе run можно писать все что угодно
     */
}
