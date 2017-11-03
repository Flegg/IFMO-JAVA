package com.ifmo.Objects.List;

public class TestMain {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Hello");
        list.add("World");
        list.add("!");

        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

        System.out.println(list.get(2));

        list.remove(2);
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

    }
}
