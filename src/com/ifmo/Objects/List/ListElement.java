package com.ifmo.Objects.List;

class ListElement {
     private int data;
     private ListElement next;

    int getData() {
        return data;
    }

    ListElement getNext() {
        return next;
    }

    void setData(int data) {
        this.data = data;
    }

    void setNext(ListElement next) {
        this.next = next;
    }
}
