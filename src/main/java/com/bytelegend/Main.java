package com.bytelegend;

public class Main {
    public static double divide(float a, float b) {
        double result = (float) a / b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("3/2=" + divide(3, 2));
    }
}
