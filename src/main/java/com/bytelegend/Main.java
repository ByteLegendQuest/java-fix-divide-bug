package com.bytelegend;

public class Main {
    public static double divide(int a, int b) {
        return new Double(a) / new Double(b);
    }

    public static void main(String[] args) {
        System.out.println("3/2=" + divide(3, 2));
    }
}
