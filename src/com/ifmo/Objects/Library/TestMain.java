package com.ifmo.Objects.Library;

public class TestMain {

    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("XXX", "YYY", 54);
        Book book1 = new Book("GGG", "LLL", 78);
        Book book2 = new Book("AAA", "SSS", 12);
        Book book3 = new Book("DDD", "FFF", 32);
        Book book4 = new Book("EEE", "RRR", 123);

        library.put(book, 12);
        library.put(book, 13);
        library.put(book1, 34);
        library.put(book2, 345);
        library.put(book3, 67);
        library.put(book3, 645);
        library.put(book4, 356);


        for (Shelf s : library.shelves) {
            System.out.println(s);
        }
    }

}
