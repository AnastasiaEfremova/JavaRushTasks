package com.company.JavaSyntax.Level_13.EasyList;

import java.util.ArrayList;

/* 
5 различных строк в списке
*/

public class Solution {
    
    public static ArrayList<String> list;
    
    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());
        System.out.println("---------------------------");

        for (String x: list) {
            System.out.println(x);
        }
    }
}
