package com.ifmo.arrays;

import java.util.Arrays;

public class Task6 {
    public static void arrayInitiaize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void isProgressive(int[] arr) {
        boolean progressive = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                progressive = true;
            }
            else {
                progressive = false;
                break;
            }
        }

        if (progressive)
            System.out.println("Последовательность чисел в массиве является строго возрастающей.");
        else
            System.out.println("Последовательность чисел в массиве не является строго возрастающей.");
    }
}
