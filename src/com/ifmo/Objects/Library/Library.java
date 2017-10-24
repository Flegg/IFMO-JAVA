package com.ifmo.Objects.Library;

public class Library {

    Shelf[] shelves = new Shelf[100];

    private boolean isAdded(int index, Book book, int quantity) {
        boolean result = false;
        if (shelves[index] == null) {
            shelves[index] = new Shelf(book, quantity);

            result = true;
        }
        else if (book.equals(shelves[index].getBook())){
            shelves[index].setCount(shelves[index].getCount() + quantity);

            result = true;
        }

        return result;
    }

    public void put(Book book, int quantity) {
        boolean isAdded = false;

        int x = Math.abs(book.hashCode() % shelves.length);

        for (int i = x; i < shelves.length; i++) {
            if (isAdded(i, book, quantity)) {
                isAdded = true;
                break;
            }
        }

        if (! isAdded) {
            for (int i = quantity; i >= 0; i--) {
                if (isAdded(i, book, quantity)) {
                    isAdded = true;
                    break;
                }
            }
        }

        if (! isAdded)
            System.out.println("Библиотека полна");
    }

    public void get(Book book, int quantity) {
        // TODO: 24.10.2017
    }
    public void sort(){
        // TODO: 24.10.2017
    }

}
