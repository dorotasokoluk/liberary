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

    public Rental (Client client, Book book){
        this.book = book;
        this.client = client;
    }

    public Rental() {

    }

    public long daysBetween (){
        long daysBetween = 1;

        return daysBetween;
    }
}
