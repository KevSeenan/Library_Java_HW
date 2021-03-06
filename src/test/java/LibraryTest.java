import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    Library library;
    Book book, book2, book3;

    @Before
    public void setUp(){
        library = new Library("Unseen University Library", 2);
        book = new Book ("Mort", "Terry Pratchett", "Fantasy");
        book2 = new Book ("Jingo", "Terry Pratchett", "Fantasy");
        book3 = new Book ("Interesting Times", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void countNumberOfBooks(){
        //Given I have a library
        assertNotNull(library);
        //When the library has no book
        //Then the number of books will be zero
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddABook(){
        //Given I have a library
        assertNotNull(library);
        //AND I have a book
        assertNotNull(book);
        //When a book is added to the library
        library.addBook(book);
        //Then number of books will be 1
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBook__ifCapacityIsFull(){
        //Given I have a library
        assertNotNull(library);
        //AND I have a book
        assertNotNull(book);
        //When the library is not at capacity

        //Then I can add a book
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canTrackNumberOfBooksByGenre(){
        //Given I have a library
        assertNotNull(library);
        //AND I have a book
        assertNotNull(book);
        //When the library has books
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        //Then I can count books by genre
        assertEquals(3, library.genreCount());

    }
}
