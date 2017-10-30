package com.ifmo.Objects.List;

public class TestMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

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

        list.remove(3);
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

    }
}
