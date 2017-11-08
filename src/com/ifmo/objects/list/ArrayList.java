package com.ifmo.objects.list;

import com.ifmo.objects.interfaces.IList;
import java.util.Iterator;

public class ArrayList<T> implements IList<T> {

    private Object[] objects;
    private static final int DEFAULT_SIZE = 10;
    private int size;

    ArrayList() {
        this.objects = new Object[DEFAULT_SIZE];
    }

    public ArrayList(int capacity) {
        if (capacity < DEFAULT_SIZE) {
            this.size = DEFAULT_SIZE;
        } else {
            this.size = capacity;
            objects = new Object[capacity];
        }
    }

    @Override
    public void add(T o) {
        if (size + 1 <= DEFAULT_SIZE) {
            objects[size++] = o;
        }
        else {
            Object[] tmp = new Object[(size * 2)];
            System.arraycopy(objects, 0, tmp, 0, size);
            objects = tmp;
            objects[size++] = o;
        }
    }

    @Override
    public T get(int index) {
        return (T)objects[index];
    }

    @Override
    public T remove(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        T result = (T) objects[index];
        int movedElements = size - index - 1;
        if (movedElements > 0) {
            System.arraycopy(objects, index + 1, objects, index, movedElements);
        }
        objects[size - 1] = null;
        size--;
        return result;
    }

    int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator(objects);
    }

    private class ArrayListIterator implements Iterator<T> {
        private Object[] array;
        private int index = 0;

        ArrayListIterator(Object[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length && array[index] != null;
        }

        @Override
        public T next() {
            return (T) array[index++];
        }
    }
}
