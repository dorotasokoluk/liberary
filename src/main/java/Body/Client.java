package Body;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Client {
    private String firstName;
    private String lastName;
    private String adress;
    private String idNumber;
    List<Book> clientsbookList = new ArrayList<>();

}

