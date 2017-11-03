package com.ifmo.objects.library;

public class Book {

    private String author;
    private String title;
    private int countOfPages;

    public Book(String author, String title, int countOfPages) {
        this.author = author;
        this.title = title;
        this.countOfPages = countOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (countOfPages != book.countOfPages) return false;
        if (author != null ? ! author.equals(book.author) : book.author != null) return false;
        return title != null ? title.equals(book.title) : book.title == null;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + countOfPages;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }

}
