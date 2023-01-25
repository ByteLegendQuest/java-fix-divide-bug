package com.bytelegend;

public class Main {
    public static double divide(int a, int b) {
         double aa = a;
         double bb = b;
         double c = aa / bb;
         return c;

    }

    public static void main(String[] args) {
        System.out.println("3/2=" + divide(3, 2));
        System.out.println("1/2=" + divide(1, 2));
    }
}
