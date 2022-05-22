package com.company.JavaCore.Level_9.Test;

import java.io.*;
import java.util.ArrayList;

public class Symbols {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\a.efremova\\Desktop\\JavaTest\\test1.txt";
        FileReader reader = new FileReader(fileName);
        ArrayList<String> str = new ArrayList<>();

        while (reader.ready()) {
            int data = reader.read();
            str.add(String.valueOf(data));
        }

        System.out.println(str);
    }
}
