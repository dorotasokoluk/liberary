package Operation;

import App.RentalBook;
import Body.Book;
import Body.Client;
import Body.Rental;
import Body.TypeBook;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;

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

    @Test
    public void calculationOfPenaltiesTesCorrect() throws ParseException {
        //given
        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateFrom = simpleDateFormat.parse("2019-10-20");
        Date dateTo = simpleDateFormat.parse("2019-10-31");

        Client client = new Client("Adam", "Małysz", "Koncertowa 20", "15");
        Book book = new Book("Władca Pierścieni", "Tolkien", "2", 1946, TypeBook.HISOTRY);
        Rental rental = new Rental(client, book, dateFrom, dateTo);
        Library library = new Library();
        //when
        double expected = 0L;
        double actual = library.calculationOfPenalties(rental);

        //then
        assertEquals(expected, actual);
    }
    @Test
    public void calculationOfPenaltieTest2() throws ParseException {
        //given
        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateFrom = simpleDateFormat.parse("2019-10-10");
        Date dateTo = simpleDateFormat.parse("2019-10-31");

        Client client = new Client("Adam", "Małysz", "Koncertowa 20", "15");
        Book book = new Book("Władca Pierścieni", "Tolkien", "2", 1946, TypeBook.HISOTRY);
        Rental rental = new Rental(client, book, dateFrom, dateTo);
        Library library = new Library();
        //when
        double expected = 14;
        double actual = library.calculationOfPenalties(rental);

        //then
        assertEquals(expected, actual);
    }

}