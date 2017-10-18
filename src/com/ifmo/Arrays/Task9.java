package com.ifmo.Arrays;

import java.util.Arrays;

public class Task9 {
    public static double[] thirdArray = new double[10];
    public static void arrayInitiaize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9 + 1);
        }
    }

    public static void thirdArrayCreation(int[] arr1, int[] arr2){
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = (double) arr1[i] / (double) arr2[i];
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void arrayPrinting(double[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void wholeNumbers(double[] arr) {
        int whole = 0;
        for (double i : arr) {
            if (i % 1 == 0) {
                whole++;
            }
        }
        System.out.println("Количество целых чисел в массиве = " + whole);
    }
}
