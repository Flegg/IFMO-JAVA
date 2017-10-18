package StringsArrays;

import java.util.Arrays;

public class Task5 {
    public static void arrayInitiaize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 6);
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void average(int[] arr1, int[] arr2) {
        double summOfFirstArray = 0.0;
        double summOfSecondArray = 0.0;
        for (int i : arr1) {
            summOfFirstArray += i;
        }

        for (int i : arr2) {
            summOfSecondArray += i;
        }

        double avrOfFirstArray = summOfFirstArray / arr1.length;
        double avrOfSecondArray = summOfSecondArray / arr2.length;

        if (avrOfFirstArray > avrOfSecondArray)
            System.out.println("Среднее арифметическое первого массива больше.");
        else if (avrOfFirstArray < avrOfSecondArray)
            System.out.println("Среднее арифметическое второго массива больше.");
        else
            System.out.println("Средние арифметические массивов равны.");
    }
}
