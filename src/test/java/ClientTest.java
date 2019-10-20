import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ClientTest {
    @Test
    public void testClient() {
        //given
        List<Book> clientsBookList = null;
        Client client = new Client("Jan", "Kowalski", "ul. Szara 1", "1527", clientsBookList);
        Client client1 = new Client("Jan", "Kowalski", "ul. Szara 1", "1527", clientsBookList);

        //when

        //then
        assertEquals("Jan", client.getFirstName());
        assertEquals("Kowalski", client.getLastName());
        assertEquals("ul. Szara 1", client.getAdress());
        assertEquals("1527", client.getIdNumber());
    }
}
