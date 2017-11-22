package com.ifmo.objects.list;

import com.ifmo.exceptions.MyException;
import com.ifmo.objects.interfaces.IList;
import com.ifmo.objects.interfaces.IQueue;
import com.ifmo.objects.interfaces.IStack;

import java.util.Iterator;

public class LinkedList<T> implements IList<T>, IStack<T>, IQueue<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;
    private int countOfModifications;

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
        countOfModifications++;
    }

    @Override
    public T remove(int index) {
        if (head == null)
            return null;

        if (index == 0) {
            T o = head.value;
            head = head.next;
            size--;
            countOfModifications++;
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
                    countOfModifications++;
                }
                else {
                    previous.next = current.next;
                    size--;
                    countOfModifications++;
                    return current.value;
                }
            }
        }
        return null;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index > size)
            throw new MyException("Element with this index is not exist");
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
    public T poll() {
        return remove(0);
    }

    @Override
    public void offer(T val) {
        add(val);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkedList<?> that = (LinkedList<?>) o;

        if (size != that.size) return false;
        if (head != null ? !head.equals(that.head) : that.head != null) return false;
        return last != null ? last.equals(that.last) : that.last == null;
    }

    @Override
    public int hashCode() {
        int result = head != null ? head.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator(head);
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> next;
        int i = countOfModifications;

        private LinkedListIterator(Node<T> next) {
            this.next = next;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public T next() {
            if (i != countOfModifications)
                throw new MyException("Concurrent Modification Exception");
            T o = next.value;
            next = next.next;
            return o;
        }
    }
}
