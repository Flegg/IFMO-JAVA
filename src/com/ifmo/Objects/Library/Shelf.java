package com.ifmo.Objects.Library;

public class Shelf {

    private Book book;
    private int count;

    public Shelf(Book book, int count) {
        this.book = book;
        this.count = count;
    }

    public Book getBook() {
        return book;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "book=" + book +
                ", count=" + count +
                '}';
    }

}
