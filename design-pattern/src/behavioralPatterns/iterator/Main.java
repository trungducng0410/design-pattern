package behavioralPatterns.iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Book 1"));
        collection.addBook(new Book("Book 2"));

        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}
