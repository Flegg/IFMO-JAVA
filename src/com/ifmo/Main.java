package com.ifmo;

import com.ifmo.Arrays.*;
import com.ifmo.Objects.Adder;
import com.ifmo.Objects.List.List;

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

        //Задание 4
        System.out.println();
        System.out.println("~~~TASK4~~~");

        int[] array4 = new int[8];
        Task4.arrayInitiaize(array4);
        Task4.arrayPrinting(array4);
        Task4.change(array4);
        Task4.arrayPrinting(array4);

        //Задание 5
        System.out.println();
        System.out.println("~~~TASK5~~~");

        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        Task5.arrayInitiaize(firstArray);
        Task5.arrayInitiaize(secondArray);
        Task5.arrayPrinting(firstArray);
        Task5.arrayPrinting(secondArray);
        Task5.average(firstArray, secondArray);

        //Задание 6
        System.out.println();
        System.out.println("~~~TASK6~~~");

        int[] array6 = new int[4];
        Task6.arrayInitiaize(array6);
        Task6.arrayPrinting(array6);
        Task6.isProgressive(array6);

        //Задание 7
        System.out.println();
        System.out.println("~~~TASK7~~~");

        int[] array7 = new int[20];
        Task7.arrayInitiaize(array7);
        Task7.arrayPrinting(array7);

        //Задание 8
        System.out.println();
        System.out.println("~~~TASK8~~~");

        int[] array8 = new int[12];
        Task8.arrayInitiaize(array8);
        Task8.arrayPrinting(array8);
        Task8.maxInArray(array8);

        //Задание 9
        System.out.println();
        System.out.println("~~~TASK9~~~");

        int[] array9First = new int[10];
        int[] array9Second = new int[10];
        Task9.arrayInitiaize(array9First);
        Task9.arrayInitiaize(array9Second);
        Task9.thirdArrayCreation(array9First, array9Second);
        Task9.arrayPrinting(array9First);
        Task9.arrayPrinting(array9Second);
        Task9.arrayPrinting(Task9.thirdArray);
        Task9.wholeNumbers(Task9.thirdArray);

        //Задание 10
        System.out.println();
        System.out.println("~~~TASK10~~~");

        int[] array10 = new int[11];
        Task10.arrayInitiaize(array10);
        Task10.arrayPrinting(array10);
        Task10.maxCount(array10);

        //Задание 11
        System.out.println();
        System.out.println("~~~TASK11~~~");

        Task11.arrayInitiaize();
        Task11.arrayPrinting();


        //Объекты

        //Adder
        Adder adder = new Adder(10);
        System.out.println(adder.getValue());
        adder.add();
        System.out.println(adder.getValue());

        // List
        List list = new List();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(17);

        list.printList();
        System.out.println("~~~~~");
        list.delete(1);
        list.printList();
        list.delete(17);
        list.printList();


    }
}
