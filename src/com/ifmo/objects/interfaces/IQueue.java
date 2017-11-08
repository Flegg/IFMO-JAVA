package com.ifmo.objects.interfaces;

public interface IQueue<T> {

    T poll(); // удаляет первый элемент
    void offer(T val); // добавляет в конец очереди

}
