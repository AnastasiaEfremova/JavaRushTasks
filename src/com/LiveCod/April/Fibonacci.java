package com.LiveCod.April;

import java.util.ArrayList;

public class Fibonacci {
    public static ArrayList<Integer> findNumbersOfFibonacci(int first, int second, int sum) {
       ArrayList<Integer> result = new ArrayList<>();
       result.add(first);
       result.add(second);

        for (int i = 2; i < sum; i++) {
            result.add(result.get(i - 1) + result.get(i - 2));
        }
        return result;
    }
}
