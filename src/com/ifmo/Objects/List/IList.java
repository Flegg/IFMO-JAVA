package com.ifmo.Objects.List;

public interface IList<T> extends Iterable<T> {
    void add(T o);
    T get(int index);
    T remove(int index);

}
