package com.company.JavaCore.Level_9.Test;

import com.company.JavaCore.Level_8.Streams.FileInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\a.efremova\\Desktop\\test1.txt");
        int maxByte = 0;

        while (fileInputStream.available() > 0) {
            int x = fileInputStream.read();
            if(x > maxByte) {
                maxByte = x;
            }
        }
        fileInputStream.close();
        System.out.println("Max byte in file is " + maxByte);

    }
}
