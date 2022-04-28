package com.company.JavaCore.Level_5.Books;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
       // books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract String MarkTwainBook(String title);

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //Add your code here

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        private String author = "Mark Twain";

        public MarkTwainBook(String author) {
            super(author);
        }

        @Override
        public String MarkTwainBook(String title) {
            return author;
        }

        @Override
        public Book getBook() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }
    }
}
