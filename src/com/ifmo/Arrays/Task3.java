package com.ifmo.Arrays;

import java.util.Arrays;

public class Task3 {

    public static void arrayInitialize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void countOfEvenMum(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
