package StringsArrays;

import java.util.Arrays;

public class Task8 {
    public static void arrayInitiaize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 31 - 15);
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void maxInArray(int[] arr) {
        int maximum = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                if (arr[i + 1] >= maximum) {
                    maximum = arr[i +1];
                    index = i + 1;
                }
            }
        }
        System.out.println("Максимальный элемент массива равен " + maximum + " его индекс последнего вхождения равен " +
                index);
    }
}
