package Body;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Book implements LiberaryTypes {

    private String title;
    private String author;
    private String bookId;
    private int releaseDate;
    TypeBook typeBook;
    boolean isRent;

    public Book (String title, String author, String bookId, int releaseDate, TypeBook typeBook){

    }

    @Override
    public boolean compareType(Object object) {
        return false;
    }
}

