package com;



public class Exceptions {
    public static void main(String[] args) {
        int a = 5;
//        if(a == 5) {
//            throw new MyException("Wrong");

        method1();
        }


    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
    }
}


