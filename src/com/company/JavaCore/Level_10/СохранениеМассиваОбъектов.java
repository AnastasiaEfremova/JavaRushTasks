package com.company.JavaCore.Level_10;

import com.company.JavaCore.Level_8.Wrapper.Cat;

import java.io.*;

import static java.lang.System.*;

public class СохранениеМассиваОбъектов {
    /*
    Сохранение и загрузка объектов
     */

    public static void main(String[] args) throws IOException {
        CatNew cat = new CatNew();
        PrintWriter writer = new PrintWriter(out);
        cat.load(new BufferedReader(new InputStreamReader(System.in)));
        cat.save(writer);

    }
}
// Допустим у нас есть класс Cat
class CatNew {
    public String name;
    public int age;
    public int weight;

    // Мы хотим добавить в него механизм сохранения и загрузки из файла

    public void save(PrintWriter writer) throws IOException {
        writer.println(name);
        writer.println(age);
        writer.println(weight);
        writer.flush();
    }

    public void load(BufferedReader reader) throws IOException {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        weight = Integer.parseInt(reader.readLine());
    }
}
