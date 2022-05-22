package com.Steams;

import java.io.*;

public class Practice {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\a.efremova\\Desktop\\JavaTest\\test1.txt");
        FileOutputStream outputStream = new FileOutputStream(file, true);
        String str = "Запись этой строки 3 раза подряд \n";
        for (int i = 0; i < 3; i++) {
            outputStream.write(str.getBytes());
        }
        FileInputStream inputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        while (bufferedInputStream.available() > 0) {
            System.out.print((char) bufferedInputStream.read());
        }

        PrintStream stream = new PrintStream(new File("C:\\Users\\a.efremova\\Desktop\\newFile.txt"));
        stream.println(555);
        stream.print("This is a new file.\n");
        stream.printf("My name is %s, i'm %d years old.", "Ivan", 40);

    }
}
