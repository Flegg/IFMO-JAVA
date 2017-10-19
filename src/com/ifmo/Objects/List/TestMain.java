package com.ifmo.Objects.List;

public class TestMain {
    public static void main(String[] args) {
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
