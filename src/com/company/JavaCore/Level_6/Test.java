package com.company.JavaCore.Level_6;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Worker workerOne = new Worker();
        Thread threadOne = new Thread(workerOne);
        threadOne.start();
        threadOne.join();
        System.out.println("The main thread is finished.");
    }

    //    static class Worker implements Runnable {
//
//        @Override
//        public void run() {
//            System.out.println("I'm a new Worker.");
//        }
    static class Worker extends Thread {

        @Override
        public void run() {
            System.out.println("The second thread is finished.");
        }
    }
}
