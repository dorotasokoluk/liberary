package Operation;

import Body.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientOperation {
    private final List<Client> clientList = new ArrayList<>();

    public void addClient(Client client) {
        Optional<Client> foundClient = clientList
                .stream()
                .filter(a -> a.getIdNumber().equals(client.getIdNumber()))
                .findAny();
        if (!foundClient.isPresent()) {
            clientList.add(client);
        }
    }
}
