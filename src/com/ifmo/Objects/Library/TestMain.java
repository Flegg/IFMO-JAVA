package com.ifmo.Objects.Library;

public class TestMain {

    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("XXX", "YYY", 54);

        for (int i = 0; i < 99; i++) {
            library.put(new Book("QQQ", "WWWW", 40), 10);
        }

        library.put(book, 12);
        library.put(book, 13);


        for (Shelf s : library.shelves) {
            System.out.println(s);
        }
    }

}
