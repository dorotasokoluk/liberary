import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void testClient() {
        //given
        Client client = new Client("Jan", "Kowalski", "ul. Szara 1", 1527L);

        //when
        //then
        assertEquals("Jan", client.getFirstName());
        assertEquals("Kowalski", client.getLastName());
        assertEquals("ul. Szara 1", client.getAdress());
        assertEquals(1527L, client.getIdNumber());
    }
}
