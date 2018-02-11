package com.brainacademy.labwork2_16_3;

import java.util.Arrays;

public class Main {

    public static void foo(int a, int b) {
        System.out.println("int a=" + a + ", int b=" + b);
    }

    public static void foo(int... a) {
        System.out.println("a[]=" + Arrays.toString(a));
    }

    public static void main(String[] strings) {
        System.out.println("******************************************");
        System.out.println("Labwork 2.16.3");
        System.out.println("-------------------------------------------");
        foo(5, 6);
        foo(7, 8, 9);
        System.out.println("******************************************");
    }
}
