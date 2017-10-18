package com.ifmo.Arrays;

public class Task1 {
    private static final int MAX = 20;
    public static void arrayInitialize(int[] arr) {
        int i = 0;
        int b = 0;

        while(++b < MAX) {
            arr[i++] = ++b;
        }
    }
    public static void arrayPrinting(int[] arr) {
        // в строчку
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // в столбик
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n" + arr[i]);
        }
    }
}
