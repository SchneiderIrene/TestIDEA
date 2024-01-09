package practice;

public class Author implements Comparable<Author>{
    private String firstName;
    private String lastName;
    private String bookTitle;
    private int year;

    public Author(String firstName, String lastName, String bookTitle, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookTitle = bookTitle;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " +  bookTitle + " " + year;
    }



    @Override
    public int compareTo(Author o) {
        int authorFirstName = getFirstName().compareTo(o.getFirstName());
        int authorLastName = getLastName().compareTo(o.getLastName());
        int authorBook = getBookTitle().compareTo(o.bookTitle);
        int authorYear = Integer.compare(getYear(), o.getYear());

        if (authorLastName == 0){
            return authorFirstName;
        }
        if (authorFirstName == 0){
            return authorBook;
        }
        if (authorBook == 0){
            return authorYear;
        }
        return authorLastName;
    }
}
