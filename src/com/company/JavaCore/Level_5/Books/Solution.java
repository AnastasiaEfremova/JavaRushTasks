package com.company.JavaCore.Level_5.Books;

public class Solution {
    /*
    Давай напишем программу, которая будет определять жанр книги, или автора, который ее написал.
Для этого:
Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
Параметр конструктора — название книги (title).
В классе MarkTwainBook реализуй все абстрактные методы.
Для метода getBook измени тип возвращаемого значения на более подходящий.
Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
agathaChristieOutput — для книг Агаты Кристи;
markTwainOutput — для книг Марка Твена.

Требования:
•	Класс Solution должен содержать public static класс MarkTwainBook.
•	Класс MarkTwainBook должен быть потомком класса Book.
•	В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром
 типа String (название книги).
•	Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром
 "Mark Twain".
•	Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения
MarkTwainBook и возвращать текущий объект.
•	Класс Solution должен содержать public static класс AgathaChristieBook.
	Класс AgathaChristieBook должен быть потомком класса Book.
•	В классе AgathaChristieBook должен быть корректно реализован конструктор
с одним параметром типа String (название книги).
•	Конструктор класса AgathaChristieBook должен вызывать конструктор класса предка (Book)
 с параметром "Agatha Christie".
•	Метод getBook в классе AgathaChristieBook должен иметь тип возвращаемого значения
AgathaChristieBook и возвращать текущий объект.
	Метод getTitle в классах AgathaChristieBook и MarkTwainBook должен возвращать
	название конкретной книги.
•	Метод getOutputByBookType должен возвращать корректную строку для объектов типа AgathaChristieBook.
•	Метод getOutputByBookType должен возвращать корректную строку для объектов типа MarkTwainBook.
•	В классе MarkTwainBook должно быть создано поле title типа String (название книги).
•	В классе AgathaChristieBook должно быть создано поле title типа String (название книги).
     */
}
