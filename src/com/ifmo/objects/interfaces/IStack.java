package com.ifmo.objects.interfaces;

public interface IStack<T> {
    void push(T val);
    T pop();
    void peek();
}
