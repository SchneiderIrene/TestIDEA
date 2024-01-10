package comparator_interface;

public class Author implements Comparable <Author>{
    private String name;
    private String bookTitle;
    private int year;

    public Author(String name, String bookTitle, int year) {
        this.name = name;
        this.bookTitle = bookTitle;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getName() + ": " + getBookTitle() + ", " + getYear();
    }

    @Override
    public int compareTo(Author o) {
        return getName().compareTo(o.getName());
    }
}
