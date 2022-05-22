package com.company.JavaCore.Level_7.Synchronized.Note;

public class Solution {
    /*
    1. Класс Note будет использоваться нитями.
    Поэтому сделай так, чтобы обращения к листу notes блокировали мьютекс notes, не this
2. Все System.out.println не должны быть заблокированы (синхронизированы),
т.е. не должны находиться в блоке synchronized

Требования:
•	Метод addNote() должен добавлять записки в список notes.
•	Метод removeNote() должен удалять записку из списка notes.
•	В методе addNote() должен находиться synchronized блок.
•	В методе removeNote() должен находиться synchronized блок.
•	Synchronized блок в методе addNote() должен блокировать мьютекс notes.
•	Synchronized блок в методе removeNote() должен блокировать мьютекс notes.
•	В synchronized блоке метода addNote() должен находиться вызов метода add у notes.
	В synchronized блоке метода removeNote() должен находиться вызов метода remove у notes.
•	Все команды вывода на экран не должны находиться в блоке synchronized.
     */
}
