package com.Steams.Wrapper.TasksWrapper;

/*
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
Метод setModel должен вывести в консоль количество элементов в списке перед обновлением модели
 (вызовом метода setModel у объекта типа TableInterface).
Метод getHeaderText должен возвращать текст в верхнем регистре - используй метод toUpperCase().

Требования:
•	Класс TableInterfaceWrapper должен реализовывать интерфейс TableInterface.
•	Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа TableInterface.
•	Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
•	Метод getHeaderText() должен возвращать текст в верхнем регистре.
•	Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
 */

import java.util.List;
import java.util.Locale;

public class Table {
    public class TableInterfaceWrapper implements TableInterface{
        private TableInterface tableInterface;
        private List rows;
        private String HeaderText;

        public TableInterfaceWrapper(TableInterface t) {
            this.tableInterface = t;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(this.rows = rows);
        }

        @Override
        public String getHeaderText() {
            tableInterface.getHeaderText();
            return HeaderText.toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(this.HeaderText = newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
