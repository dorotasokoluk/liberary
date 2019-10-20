import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalBookTest {

    @Test
    public void testAddClient() {
        // given
        Client client = new Client("Jan", "Kowalski", "ul. Kolorowa 17, Lublin", "890712707");
        RentalBook rentalBook = new RentalBook();

        // when
        rentalBook.addClient(client);

        // then
        assertEquals("Jan", client.getFirstName());
        assertEquals("Kowalski", client.getLastName());
        assertEquals("ul. Kolorowa 17, Lublin", client.getAdress());
        assertEquals("890712707", client.getIdNumber());
    }
    
    @Test
    public void testAddBook() {
        // given
        Client client = new Client("Jan", "Kowalski", "ul. Kolorowa 17, Lublin", "890712707");
        Book book = new Book("Pan Tadeusz", "Adam Mickiewicz", "120089", 2012, TypeBook.HISOTRY);
        RentalBook rentalBook = new RentalBook();

        // when
        rentalBook.addBook(book);

        // then
        assertEquals("Pan Tadeusz", book.getTitle());
        assertEquals("Adam Mickiewicz", book.getAuthor());
        assertEquals("120089", book.getBookId());
        assertEquals(2012, book.getReleaseDate());
        assertEquals(TypeBook.HISOTRY, book.getTypeBook());
    }
}