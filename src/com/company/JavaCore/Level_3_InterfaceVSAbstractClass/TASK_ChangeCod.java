package com.company.JavaCore.Level_3_InterfaceVSAbstractClass;
/*
Четыре ошибки нужно исправить
*/
public class TASK_ChangeCod {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        Hobby HOBBY = new Hobby(); // = new Hobby(); - в интерфейсе нельзя создавать ссылки на объект
        // переменные интерфейса могут быть только public
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
