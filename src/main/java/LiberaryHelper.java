import java.util.List;
import java.util.Optional;

public class LiberaryHelper<T extends LiberaryTypes> {

    public T search(List<T> list, T toSearch) {
        Optional<T> present = list.stream().filter(a -> a.compareType(toSearch)).findAny();
//if (present){
        throw new IllegalArgumentException("Book n");
    }

}


