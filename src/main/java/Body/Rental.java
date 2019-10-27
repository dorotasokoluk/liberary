package Body;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Getter
@AllArgsConstructor
@Setter
public class Rental {
    private Client client;
    private Book book;
    private Long rentalID;
    private Date dateFrom;
    private Date dateTo;

    public Rental(Client client, Book book) {
        this.book = book;
        this.client = client;

    }

    public Rental(Client client, Book book, Date dateFrom, Date dateTo) {

        this.client = client;
        this.book = book;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Long daysBetween(Date dateFrom, Date dateTo) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Calendar calendarDateTo = Calendar.getInstance();
        Calendar calendarDateFrom = Calendar.getInstance();
        calendarDateFrom.setTime(dateFrom);
        calendarDateTo.setTime(dateTo);
        System.out.println(calendarDateFrom + " " + calendarDateTo);
        long diff = calendarDateTo.getTimeInMillis() - calendarDateFrom.getTimeInMillis();
        System.out.println(diff / (1000 * 60 * 60 * 24));
        return (diff / (1000 * 60 * 60 * 24)); // 1000 milisekund w sekundzie * 60 sekund w minucie * 60 minut w godzinie * 24 godziny w dniu
    }


}
