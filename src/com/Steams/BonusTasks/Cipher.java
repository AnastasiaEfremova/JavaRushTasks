package com.Steams.BonusTasks;

/*
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
•	Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
•	В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
•	В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
•	Созданные для файлов потоки должны быть закрыты.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cipher {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        if(!(mode.equals("-e") || mode.equals("-d"))) return;

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        if(mode.equals("-e")) {
            while (inputStream.available() > 0) {
                outputStream.write(inputStream.read() + 1);
            }
        } else {
            while (inputStream.available() > 0) {
                outputStream.write(inputStream.read() - 1);
            }
        }

        inputStream.close();
        outputStream.close();
    }
}
