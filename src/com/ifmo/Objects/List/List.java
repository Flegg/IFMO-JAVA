package com.ifmo.Objects.List;

public class List {
    private ListElement head;
    private ListElement last;

    public void add(int i) {
        ListElement listElement = new ListElement();
        listElement.setData(i);

        if (head == null) {
            head = listElement;
            last = listElement;
        }
        else {
            last.setNext(listElement);
            last = listElement;
        }
    }

    public void printList() {
        ListElement i = head;
        while (i != null) {
            System.out.println(i.getData() + " ");
            i = i.getNext();
        }
    }

    public void delete(int i) {
        if (head == null) {
            return;
        }

        if (head.getData() == i) {
            head = head.getNext();
            return;
        }

        ListElement search = head;
        while (search.getNext() != null) {
            if (search.getNext().getData() == i) {
                if (last == search.getNext()) {
                    last = search;
                }
                search.setNext(search.getNext().getNext());
            }
            else {
                search = search.getNext();
            }
        }
    }
}
