import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book implements LiberaryTypes {

    private String title;
    private String author;
    private String bookId;
    private int releaseDate;

    @Override
    public boolean compareType(Object object) {
        return false;
    }
}

