import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {

    private String title;
    private String author;
    private String bookId;
    private int releaseDate;

}

