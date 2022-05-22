package com.Steams.Wrapper;

import java.io.*;

public class WriteMyWrapper {
    /*
    Пишем свой поток-обертку на System.in
     */
    public static void main(String[] args) throws IOException {
        // кладем данные в строку
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();
        System.out.println(data);

        // Оборачиваем строку в класс ByteArrayInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        // Подменяем in на is
        System.setIn(is);

        // вызываем обычный метод, который не подозревает о наших манипуляциях
        readAndPrintLine();
        }

        public static void readAndPrintLine() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String line = reader.readLine();
                if(line == null) break;
                System.out.println(line);
            }
        }
    }

