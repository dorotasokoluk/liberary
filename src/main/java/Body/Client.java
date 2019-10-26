package Body;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Setter
public class Client {
    private String firstName;
    private String lastName;
    private String adress;
    private String idNumber;
    private List<Book> clientsbookList = new ArrayList<>();

    public Client(String firstName, String lastName, String adress, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.idNumber = idNumber;
    }


}

