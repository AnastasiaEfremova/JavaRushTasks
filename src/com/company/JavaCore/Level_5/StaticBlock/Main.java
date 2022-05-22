package com.company.JavaCore.Level_5.StaticBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param = reader.readLine();
        if(param.equals("helicopter")) {
            result = new Helicopter();
        } else if(param.equals("plane")) {
            int param2 = Integer.parseInt(reader.readLine());
            result = new Plane(param2);
        }
        reader.close();
    }
}
