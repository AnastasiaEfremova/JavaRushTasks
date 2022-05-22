package com.company.JavaCore.Level_7.TaskNotes;

public class Solution {
    /*
    Асинхронность выполнения нитей.
1. Класс Note будет использоваться нитями.
2. Создай public static нить NoteThread (Runnable не является нитью),
которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
2.1. Используя метод addNote добавит заметку с именем [getName() + "-Note" + index],
например, при index=4
"Thread-0-Note4"
2.2. Заснет на 1 миллисекунду
2.3. Используя метод removeNote удалит заметку
2.4. В качестве параметра в removeNote передай имя нити - метод getName()

Требования:
•	Класс Solution должен содержать public static класс NoteThread.
•	Класс NoteThread должен быть нитью.
•	В методе run класса NoteThread должен быть цикл.
•	Метод run класса NoteThread должен 1000 раз вызывать метод addNote c параметром
(getName() + "-Note" + index).
•	Метод run класса NoteThread должен 1000 раз вызывать Thread.sleep() c параметром (1).
•	Метод run класса NoteThread должен 1000 раз вызывать метод removeNote c параметром (getName()).
     */
}
