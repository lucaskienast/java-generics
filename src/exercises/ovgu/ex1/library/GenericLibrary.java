package exercises.ovgu.ex1.library;

import java.util.ArrayList;
import java.util.List;

public class GenericLibrary<T extends Media> {

    private List<T> resources = new ArrayList<>();

    public void addMedia(T x) {
        resources.add(x);
    }

    public T retrieveLast() {
        int size = resources.size();

        if (size > 0) {
            return resources.get(size - 1);
        }

        return null;
    }

}
