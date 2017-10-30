package com.ifmo.Objects.List;

import java.util.Iterator;

public class LinkedList implements IList {
    private Node head;
    private Node last;

    public void add(Object value) {
        Node tmp = new Node(value);
        if (head ==null) {
            head = tmp;
            last = tmp;
        }
        else {
            last.next = tmp;
            last = tmp;
        }
    }

    @Override
    public Object remove(int index) {
        if (head == null)
            return null;

        if (index == 0) {
            Object o = head.value;
            head = head.next;
            return o;
        }

        Node previos = search(index - 1);
        if (previos != null) {
            Node current = previos.next;

            if (current != null) {
                previos.next = previos.next.next;
                return current.value;
            }
        }
        return null;
    }

    @Override
    public Object get(int index) {
        Node node = search(index);
        if (node != null)
            return node.value;
        return null;
    }

    private Node search(int index) {
        if (index == 0) {
            return head;
        }

        int cnt = 0;

        Node node = head;

        while (node != null) {
            if (cnt++ == index) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator(head);
    }

    private static class LinkedListIterator implements Iterator {
        private Node next;

        private LinkedListIterator(Node next) {
            this.next = next;
        }

        @Override
        public boolean hasNext() {
            if (next != null)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            Object o = next.value;
            next = next.next;
            return o;
        }
    }
}
