package com.Steams.Wrapper;

public class CreateWrapper {
    /*
    Для того чтобы расширить функционал существующего метода,
    можно создать для него класс-обертку (wrapper).
    Для этого нужно:
    1. Создать свой класс-обертку и унаследоваться от класса/интерфейса,
    для которого обертку будем использовать.
    2. Передать оборачиваемый объект в конструктор класса.
    3. Переопределить все методы в классе-обертке, и вызвать в них
    методы оборачиваемого объекта.
    4. Внести изменения в методы на свой вкус
     */
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska");
        CatWrapper cat2 = new CatWrapper(cat);
        System.out.println(cat2.getName());
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CatWrapper extends Cat {
    // унаследовались от класса, для которого делаем обертку
    private Cat catOrigin; // создали объект класса, для которого делаем обертку

    public CatWrapper(Cat cat) {
        // передали объект оригинальный в конструктор
        super(cat.getName());
        this.catOrigin = cat;
    }

    @Override
    public String getName() {
        return "Кот по имени " + catOrigin.getName();
    }

    @Override
    public void setName(String name) {
        catOrigin.setName(name);
    }
}

