package com.ifmo.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task10 {

    private static Random rnd = new Random();

    public static void arrayInitiaize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(3) - 1;
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void maxCount(int[] arr) {
        int countMinusOne = 0;
        int countZero = 0;
        int countOne = 0;

        for (int i : arr) {
            if (i == -1)
                countMinusOne++;
            else if (i == 0)
                countZero++;
            else
                countOne++;
        }

        if (countMinusOne > countOne && countMinusOne > countZero)
            System.out.println("Чаще всего в массиве встречается число \"-1\". " + countMinusOne + " раза");
        else if (countZero > countMinusOne && countZero > countOne)
            System.out.println("Чаще всего в массиве встречается число \"0\". " + countZero + " раза");
        else if (countOne > countMinusOne && countOne > countZero)
            System.out.println("Чаще всего в массиве встречается число \"1\". " + countOne + " раза");
    }
}
