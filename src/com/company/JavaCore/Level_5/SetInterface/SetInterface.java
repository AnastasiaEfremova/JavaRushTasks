package com.company.JavaCore.Level_5.SetInterface;

/*
Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
Реализуй их методы.
 */

public class SetInterface {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        public boolean isMovable() {
            return true;
        }

        @Override
        public Object getAllowedAction(String name) {
            return name;
        }

        @Override
        public Object getAllowedAction() {
            return "Одевайся!";
        }
    }
}
