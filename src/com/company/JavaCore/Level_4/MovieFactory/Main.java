package com.company.JavaCore.Level_4.MovieFactory;

import com.company.JavaCore.Level_4.NewComputer.Mouse;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String key = "";
            while (true) {
                key = reader.readLine();
                if(key == null) break;
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

        }

        static class MovieFactory {

           static Movie getMovie(String key) {
                Movie movie = null;

                //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
                if ("soapOpera".equals(key)) {
                    movie = new SoapOpera();
                } else if ("cartoon".equals(key)) {
                    movie = new Cartoon();
                } else if ("thriller".equals(key)) {
                    movie = new Thriller();
                }

                return movie;
            }
        }

        static abstract class Movie {
        }

        static class SoapOpera extends Movie {
        }

        static class Cartoon extends Movie {

        }

        static class Thriller extends Movie {

        }

    }


