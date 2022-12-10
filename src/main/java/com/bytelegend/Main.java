package com.bytelegend;

public class Main {
    public static double divide(int a, int b) {
        double x = a;
        double y = b;
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println("3/2=" + String.format("%.1f",divide(3, 2)));
    }
}
