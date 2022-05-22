package com.company.JavaCore.Level_8.Wrapper;

import java.io.*;

public class WrapperForSystemIn {
    public static void main(String[] args) throws IOException {

        // кладем данные в строку
        StringBuilder builder = new StringBuilder();
        builder.append("Lena").append('\n');
        builder.append("Olya").append('\n');
        String data = builder.toString();

        // Оборачиваем строку в класс ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        System.setIn(is);

        // Вызываем обычный метод, который ничего не подозревает


    }
    public static void readAndPrintLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = reader.readLine();
            if(line == null) break;
            System.out.println(line);

            reader.close();

        }
    }
}
