import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp(){
        library = new Library("Unseen University Library");
        book = new Book ("Mort", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void countNumberOfBooks(){
        //Given I have a library
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
}
