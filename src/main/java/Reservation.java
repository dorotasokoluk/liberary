import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Getter

public class Reservation {
    private Client client;
    private Book book;
    private Date dateFrom;
    private Date dateTo;
}
