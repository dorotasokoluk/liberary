package Body;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book implements LiberaryTypes<Book> {

    private String title;
    private String author;
    private String bookId;
    private int releaseDate;
    TypeBook typeBook;

    @Override
    public boolean compareType(Book object) {
        return false;
    }
}