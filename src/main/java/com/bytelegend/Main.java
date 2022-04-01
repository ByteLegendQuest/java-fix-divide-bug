package com.bytelegend;

public class Main {
    public static double divide(int a, int b) {
        return Double.valueOf(a) / Double.valueOf(b);
    }

    public static void main(String[] args) {
        System.out.println("3/2=" + divide(3, 2));
    }
}
