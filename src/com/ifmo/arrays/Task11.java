package com.ifmo.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task11 {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Random rnd = new Random();

    private static int length = 0;
    private static int[] array;

    public static void arrayInitiaize() {
        System.out.println("Введите целое положительное число:");
        while(true) {
            try {
                length = Integer.parseInt(reader.readLine());
                if (length > 0 && length % 2 == 0) {
                    break;
                }
                else {
                    System.out.println("Число не удовлетворяет парамерам!!!");
                    System.out.println("Введите целое положительное число:");

                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11) - 5;
        }
    }

    public static void arrayPrinting() {
        System.out.println(Arrays.toString(array));
    }

    public static void halfModuleSum() {

    }

}
