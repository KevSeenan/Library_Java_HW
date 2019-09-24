import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genreTracker;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
        this.genreTracker = new HashMap<String, Integer>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(bookCount() < capacity) {
            this.books.add(book);

            if(!this.genreTracker.containsKey(book)){
                Integer count = 0;
                this.genreTracker.get(book);
            } else {
               Integer count = 1;
               this.genreTracker.get(book);
            }
        }
    }

    public int genreCount() {
        return this.genreTracker.size();
    }
}
