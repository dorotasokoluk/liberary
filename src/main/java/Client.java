import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Client implements LiberaryTypes<Client> {
    private String firstName;
    private String lastName;
    private String adress;
    private String idNumber;

    @Override
    public boolean compareType(Client object) {
        return idNumber.equals(object.idNumber);
    }
}
