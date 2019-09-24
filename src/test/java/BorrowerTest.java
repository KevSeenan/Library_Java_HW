import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void setUp() {
        borrower = new Borrower("Sam Vimes");
        book = new Book("Guards! Guards!", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void canTakeABook() {

        //Given I have a borrower
        assertNotNull(borrower);
        //AND I have a book
        assertNotNull(book);
        //When the borrower takes a book
        borrower.addBook(book);
        //Then the borrowers collection increases to 1
        assertEquals(1, borrower.bookCount());
    }
}
