import StringsArrays.*;

public class Main {
    public static void main(String[] args) {
        //МАССИВЫ

        //Задание 1
        System.out.println("~~~TASK1~~~");

        int array1[] = new int[10];
        Task1.arrayInitialize(array1);
        Task1.arrayPrinting(array1);

        //Задание 2
        System.out.println();
        System.out.println("~~~TASK2~~~");

        int array2[] = new int[50];
        Task2.arrayInitialize(array2);
        Task2.arrayPrinting(array2);

        //Задание 3
        System.out.println();
        System.out.println("~~~TASK3~~~");

        int array3[] = new int[15];
        Task3.arrayInitialize(array3);
        Task3.arrayPrinting(array3);
        Task3.countOfEvenMum(array3);


    }
}
