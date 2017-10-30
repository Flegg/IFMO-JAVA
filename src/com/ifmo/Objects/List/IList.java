package com.ifmo.Objects.List;

public interface IList extends Iterable {
    void add(Object o);
    Object get(int index);
    Object remove(int index);

}
