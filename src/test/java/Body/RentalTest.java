package Body;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    @Test
    public void testRental() throws ParseException {
        //given
        String pattern = "dd-mm-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateFrom = simpleDateFormat.parse("2019-10-20");
        Date dateTo = simpleDateFormat.parse("2019-10-31");

        Client client = new Client("Adam", "Małysz", "Koncertowa 20", "15");
        Book book = new Book("Władca Pierścieni", "Tolkien", "2", 1946, TypeBook.HISOTRY);
        Rental rental = new Rental(client, book, dateFrom, dateTo);

        //when

        //then
        assertEquals(client, rental.getClient());
        assertEquals(book, rental.getBook());
        assertEquals(dateFrom, rental.getDateFrom());
        assertEquals(dateTo, rental.getDateTo());
    }

}
