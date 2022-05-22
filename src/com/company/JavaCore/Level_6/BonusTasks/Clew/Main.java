package com.company.JavaCore.Level_6.BonusTasks.Clew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new OneThread()));
        threads.add(new Thread(new TwoThread()));
        threads.add(new Thread(new ThreeThread()));
        threads.add(new Thread(new FourThread()));
        threads.add(new Thread(new FiveThread()));

    }

    public static void main(String[] args) {
    }

    static class OneThread extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println("OneThread");
            }
        }
    }

    static class TwoThread extends Thread {

        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    static class ThreeThread extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    System.out.println("Ура!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class FourThread extends Thread implements Message {

        @Override
        public void run() {

        }

        @Override
        public void showWarning() {
            FourThread.interrupted();
        }
    }

    static class FiveThread extends Thread {

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = null;
            while (!s.equals("N")) {
                try {
                    s = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
