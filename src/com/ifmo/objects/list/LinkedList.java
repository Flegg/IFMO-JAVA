package com.ifmo.objects.list;

import com.ifmo.objects.interfaces.IList;
import com.ifmo.objects.interfaces.IStack;

import java.util.Iterator;

public class LinkedList<T> implements IList<T>, IStack<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;

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
        size++;
    }

    @Override
    public T remove(int index) {
        if (head == null)
            return null;

        if (index == 0) {
            T o = head.value;
            head = head.next;
            size--;
            return o;
        }

        Node<T> previous = search(index - 1);
        if (previous != null) {
            Node<T> current = previous.next;

            if (current != null) {
                if (current.equals(last)) {
                    previous.next = current.next;
                    last = previous;
                    size--;
                }
                else {
                    previous.next = current.next;
                    size--;
                    return current.value;
                }
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
    public void push(T val) {
        add(val);
    }

    @Override
    public T pop() {
        return remove(size - 1);
    }

    @Override
    public void peek() {
        if (head == null) {
            System.out.println("Тут ничего нет");
        }
        else {
            Node<T> tmp = search(size - 1);
            System.out.println(tmp != null ? tmp.value : "NULL");
        }
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
