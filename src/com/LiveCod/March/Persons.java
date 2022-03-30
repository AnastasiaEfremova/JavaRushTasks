package com.LiveCod.March;

class Person {
    private String name;
    private String position;
    private int age;

    public Person (String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age;
    }
}
