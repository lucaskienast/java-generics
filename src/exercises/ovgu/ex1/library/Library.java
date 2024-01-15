package exercises.ovgu.ex1.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List resources = new ArrayList<>();

    public void addMedia(Media x) {
        resources.add(x);
    }

    public Media retrieveLast() {
        int size = resources.size();

        if (size > 0) {
            return (Media) resources.get(size - 1);
        }

        return null;
    }

}
