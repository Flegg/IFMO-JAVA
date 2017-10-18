package StringsArrays;

import java.util.Arrays;

public class Task7 {

    public static void arrayInitiaize(int[] arr) {
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
