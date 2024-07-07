package behavioralPatterns.iterator;

public class BookIterator implements Iterator {
    private int currentIndex = 0;
    private BookCollection bookCollection;

    public BookIterator(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < bookCollection.getLength();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            Book book = bookCollection.getAt(currentIndex);
            currentIndex += 1;
            return book;
        }
        return null;
    }
}
