package Body;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Calendar;
import java.util.Date;

@Getter
@AllArgsConstructor

public class Rental {
    private Client client;
    private Book book;
    private Date dateFrom;
    private Date dateTo;


    public long  daysBetween (Date dateFrom, Date dateTo) {
        Calendar date = (Calendar) dateFrom.clone();
        long daysBetween = 0;
        while (date.before(dateTo)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        return daysBetween;
    }
}
