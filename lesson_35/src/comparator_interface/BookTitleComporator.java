package comparator_interface;

import java.util.Comparator;

public class BookTitleComporator implements Comparator<Author> {
    @Override
    public int compare(Author o1, Author o2) {
        return o1.getBookTitle().compareTo(o2.getBookTitle());
    }
}

