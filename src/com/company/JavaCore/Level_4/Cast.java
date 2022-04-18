package com.company.JavaCore.Level_4;

/*
Правильно расставить наследование между Building (здание) и School (здание школы).
Подумать, объект какого класса должны возвращать методы getSchool и getBuilding.
Изменить null на объект класса Building или School.
 */

public class Cast {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        return new School();
    }

    public static Building getBuilding() {
        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
