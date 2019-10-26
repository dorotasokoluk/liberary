package Operation;

import App.RentalBook;
import Body.Book;
import Body.Client;
import Body.TypeBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LiberaryTest {
    @Test
    public void testAddBook() {
        // given
        Client client = new Client("Jan", "Kowalski", "ul. Kolorowa 17, Lublin", "890712707");
        Book book = new Book("Pan Tadeusz", "Adam Mickiewicz", "120089", 2012, TypeBook.HISOTRY);
        RentalBook rentalBook = new RentalBook();

        // when
        //rentalBook.addBook(book);

        // then
        Assert.assertEquals("Pan Tadeusz", book.getTitle());
        Assert.assertEquals("Adam Mickiewicz", book.getAuthor());
        Assert.assertEquals("120089", book.getBookId());
        Assert.assertEquals(2012, book.getReleaseDate());
        Assert.assertEquals(TypeBook.HISOTRY, book.getTypeBook());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeBook() {
        // given
        Book book = new Book("Ogniem i mieczem", "Henryk Sienkiewicz", "01889", 2001, TypeBook.HISOTRY);
        RentalBook rentalBook = new RentalBook();

        // when
        //rentalBook.removeBook(book);

        // then
        Assert.assertEquals("Ogniem i mieczem", book.getTitle());
        Assert.assertEquals("Henryk Sienkiewicz", book.getAuthor());
        Assert.assertEquals("01889", book.getBookId());
        Assert.assertEquals(2001, book.getReleaseDate());
        Assert.assertEquals(TypeBook.HISOTRY, book.getTypeBook());
    }

}