import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@AllArgsConstructor

public class RentalBook {
    private final List<Client> clientList = new ArrayList<>();
    private final List<Book> bookList = new ArrayList<>();
    private final List<Rental> rentalList = new ArrayList<>();

    public void addClient(final Client client) {
        Optional<Client> foundClient = clientList
                .stream()
                .filter(a -> a.getIdNumber() == client.getIdNumber())
                .findAny();
        if (!foundClient.isPresent()) {
            clientList.add(client);
        }
    }

    public void addBook(Book book) {
        Optional<Book> foundBook = bookList
                .stream()
                .filter(a -> a.getBookId().equals(book.getBookId()))
                .findAny();
        if (!foundBook.isPresent()) {
            bookList.add(book);
        }
    }


}
