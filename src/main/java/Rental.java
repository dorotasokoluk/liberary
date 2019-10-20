import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor

public class Rental {
    private Client client;
    private Book book;
    private Date dateFrom;
    private Date dateTo;
}
