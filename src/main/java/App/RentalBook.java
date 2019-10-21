package App;

import Body.Book;
import Body.Client;
import Body.Rental;
import Body.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class RentalBook {
    private final List<Client> clientList = new ArrayList<>();
    private final List<Book> bookList = new ArrayList<>();
    private final List<Rental> rentalList = new ArrayList<>();
    private final List<Reservation> reservationList = new ArrayList<>();
    private Map<Book, Integer> booksInLiberary = new HashMap<Book, Integer>();
}

// Dodane do ClientOperation
//    public void addClient(Client client) {
//        Optional<Client> foundClient = clientList
//                .stream()
//                .filter(a -> a.getIdNumber().equals(client.getIdNumber()))
//                .findAny();
//        if (!foundClient.isPresent()) {
//            clientList.add(client);
//        }
//    }

// przeniesione do BookOperation
//    public void addBook(Book book) {
//        Optional<Book> foundBook = bookList
//                .stream()
//                .filter(a -> a.getBookId().equals(book.getBookId()))
//                .findAny();
//        if (!foundBook.isPresent()) {
//            bookList.add(book);
//
//        } else throw new IllegalArgumentException();
//
//
//        Book findBookForCount = booksInLiberary.keySet().stream()
//                .filter(a -> a.getAuthor().equals(book.getAuthor()))
//                .filter(a -> a.getTitle().equals(book.getTitle()))
//                .findAny().orElse(null);
//        if (findBookForCount != null) {
//            Integer integer = booksInLiberary.get(findBookForCount);
//            booksInLiberary.put(findBookForCount, ++integer);
//        } else {
//            booksInLiberary.put(book, 1);
//        }
