package behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Aggregate {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(this);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Book getAt(int currentIndex) {
        return books.get(currentIndex);
    }
}
