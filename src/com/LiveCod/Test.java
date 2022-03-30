package com.LiveCod;

public class Test {
    public static void main(String[] args) {

    }

    public static class HomeWork {

            public static void main(String[] args) {
                String str = "1101011001";
                System.out.println(parsing(str));
            }

            public static String parsing(String numbers) {
                String[] result = numbers.split("");
                String combination = "";
                for (int i = 0; i < result.length; i++) {
                    if (result[i].equals("1")) {
                        combination = i + 1 + " ";
                    }
                }
                return combination;
            }
        }
}