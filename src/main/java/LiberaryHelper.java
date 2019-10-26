import Body.LiberaryTypes;

import java.util.List;
import java.util.Optional;

public class LiberaryHelper<T extends LiberaryTypes> {
    // do dokończenia
    public void search(List<T> list, T toSearch) {
        Optional<T> present = list.stream().filter(a -> a.compareType(toSearch)).findAny();

        if (!present.isPresent()) {
            throw new IllegalArgumentException(" not found");
        }


    }

    public void add(List<T> list, T toAdd) {
        Optional<T> exist = list.stream().filter(a -> a.compareType(toAdd))
                .findAny();
        if (!exist.isPresent()) {
            list.add(toAdd);
        }

    }


    public void remove(List<T> list, T toRemove) {
        Optional<T> exist = list.stream().filter(a -> a.compareType(toRemove)).findAny();

        if (!exist.isPresent()) {
            throw new IllegalArgumentException("Not Found");
        } else
            list.remove(toRemove);
    }
}



