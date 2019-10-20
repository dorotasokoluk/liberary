import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;

public class ReservationTest {
    private String pattern = "yyyy-mm-dd";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    @Test
    public void testReservation() throws ParseException {
        //given
        Client client = new Client("Jan", "Kowalski", "ul. Szara 1", "1527");
        Book book = new Book("Władca Pierścieni", "J.R.R. Tolkien", "WYP1111", 1968, TypeBook.DRAMA);
        Date dateFrom = simpleDateFormat.parse("2019-10-20");
        Date dateTo = simpleDateFormat.parse("2019-10-27");
        Reservation reservation = new Reservation(client, book, dateFrom, dateTo);

        //when
        //then
        assertEquals(client, reservation.getClient());
        assertEquals(book, reservation.getBook());
        assertEquals(dateFrom, reservation.getDateFrom());
        assertEquals(dateTo, reservation.getDateTo());

    }
}