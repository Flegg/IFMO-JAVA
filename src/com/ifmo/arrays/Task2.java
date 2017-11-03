package com.ifmo.arrays;

import java.util.Arrays;

public class Task2 {
    private static final int MAX = 100;

    public static void arrayInitialize(int[] arr) {
        int i = 0;
        int b = 0;

        while (++b < MAX) {
            arr[i++] = b++;
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[arr.length - i] + " ");
        }
    }
}
