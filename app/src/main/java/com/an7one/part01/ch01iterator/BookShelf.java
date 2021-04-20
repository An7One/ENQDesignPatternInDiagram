package com.an7one.part01.ch01iterator;

public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last;

    public BookShelf(int capacity) {
        this.last = 0;
        this.books = new Book[capacity];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        ++last;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
