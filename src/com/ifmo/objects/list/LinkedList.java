package com.ifmo.objects.list;

import java.util.Iterator;

public class LinkedList<T> implements IList<T> {
    private Node<T> head;
    private Node<T> last;

    public void add(T value) {
        Node<T> tmp = new Node<>(value);
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
    public T remove(int index) {
        if (head == null)
            return null;

        if (index == 0) {
            T o = head.value;
            head = head.next;
            return o;
        }

        Node<T> previos = search(index - 1);
        if (previos != null) {
            Node<T> current = previos.next;

            if (current != null) {
                previos.next = previos.next.next;
                return current.value;
            }
        }
        return null;
    }

    @Override
    public T get(int index) {
        Node<T> node = search(index);
        if (node != null)
            return node.value;
        return null;
    }

    private Node<T> search(int index) {
        if (index == 0) {
            return head;
        }

        int cnt = 0;

        Node<T> node = head;

        while (node != null) {
            if (cnt++ == index) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator(head);
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> next;

        private LinkedListIterator(Node<T> next) {
            this.next = next;
        }

        @Override
        public boolean hasNext() {
//            if (next != null)
//                return true;
//            else
//                return false;

            return next != null;
        }

        @Override
        public T next() {
            T o = next.value;
            next = next.next;
            return o;
        }
    }
}
