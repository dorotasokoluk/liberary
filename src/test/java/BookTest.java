import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testBook() {
        // given
        Book book = new Book("Księgi Jakubowe", "Olga Tokarczuk", "12077", "2014");

        // when

        // then
        assertEquals("Księgi Jakubowe", book.getTitle());
        assertEquals("Olga Tokarczuk", book.getAuthor());
        assertEquals("12077", book.getBookId());
        assertEquals("2014", book.getReleaseDate());
    }
}