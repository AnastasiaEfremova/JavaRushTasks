package com.company.JavaCore;

import java.io.*;

public class InputAndOutputStream {
    public static void main(String[] args) throws IOException {
        InputStream i = new FileInputStream("C:\\Users\\a.efremova\\Desktop\\test.txt");
        OutputStream o = new FileOutputStream("C:\\Users\\a.efremova\\Desktop\\test2.txt");

        while (i.available() > 0) {
            int data = i.read();
            o.write(data);
        }

        i.close();
        o.close();

    }
}
