package com.company.JavaCore.Level_6.BonusTasks.RunAllThreads;

public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName() + " " + e.getMessage());

    }
}
