package Operation;

import Body.Book;
import Body.Client;
import Body.Rental;
import Body.Reservation;
import lombok.Getter;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

import java.util.*;

@Getter
public class Library {
    private final List<Book> bookList = new ArrayList<>();
    private final List<Client> clientList = new ArrayList<>();
    private final List<Rental> rentalList = new ArrayList<>();
    private final List<Reservation> reservationList = new ArrayList<>();
    private Map<Book, Integer> booksInLiberary = new HashMap<Book, Integer>();

    public void addBook(Book book) {
        Optional<Book> foundBook = bookList
                .stream()
                .filter(a -> a.getBookId().equals(book.getBookId()))
                .findAny();
        if (!foundBook.isPresent()) {
            bookList.add(book);

        } else throw new IllegalArgumentException();

        Book findBookForCount = booksInLiberary.keySet().stream()
                .filter(a -> a.getAuthor().equals(book.getAuthor()))
                .filter(a -> a.getTitle().equals(book.getTitle()))
                .findAny().orElse(null);
        if (findBookForCount != null) {
            Integer integer = booksInLiberary.get(findBookForCount);
            booksInLiberary.put(findBookForCount, ++integer);
        } else {
            booksInLiberary.put(book, 1);
        }
    }

    public void removeBook(Book book) {
        Book findBookForCount1 = booksInLiberary.keySet().stream()
                .filter(a -> a.getAuthor().equals(book.getAuthor()))
                .filter(a -> a.getTitle().equals(book.getTitle()))
                .findAny().orElse(null);
        if (findBookForCount1 != null) {
            Integer integer = booksInLiberary.get(findBookForCount1);
            booksInLiberary.put(findBookForCount1, integer--);
        } else throw new IllegalArgumentException();

        Optional<Book> foundBook = bookList
                .stream()
                .filter(a -> a.getBookId().equals(book.getBookId()))
                .findAny();
        if (!foundBook.isPresent()) {
            bookList.remove(book);
        } else throw new IllegalArgumentException();
    }

    public void addClient(Client client) {
        Optional<Client> foundClient = clientList
                .stream()
                .filter(a -> a.getIdNumber().equals(client.getIdNumber()))
                .findAny();
        if (!foundClient.isPresent()) {
            clientList.add(client);
        }
    }

    public void removeClient(Client client) {
        Optional<Client> foundClient = clientList
                .stream()
                .filter(a -> a.getIdNumber().equals(client.getIdNumber()))
                .findAny();
        if (!foundClient.isPresent()) {
            clientList.remove(client);
        }
    }

    public void rentBook(Book book, Client client) {
        Rental rental = new Rental();
        Integer integer = null;

        Optional<Client> clientFound = clientList
                .stream()
                .filter(a -> a.getIdNumber().equals(client.getIdNumber()))
                .findAny();

        Book bookinLibrary = booksInLiberary.keySet().stream()
                .filter(a -> a.getAuthor().equals(book.getAuthor()))
                .filter(a -> a.getTitle().equals(book.getTitle()))
                .findAny().orElse(null);
        if (bookinLibrary != null) {
        integer = booksInLiberary.get(bookinLibrary);
        }

        if (integer>0 && clientFound.isPresent()){
            booksInLiberary.put(bookinLibrary, integer--);
            client.getClientsbookList().add(book);


        }


    }

    public void returnBook() {

    }

}
