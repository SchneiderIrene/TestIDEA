package aggregation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Street", 12, "Berlin");

        Student student = new Student("John", 202020, address );
        Teacher teacher = new Teacher("mr.Smith", 30330,
                new Address("Street3", 67, "Berlin"));

        School school = new School("AIT-TR",
                new Address("LinkStr", 2, "Berlin"));

        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        Book [] books = {book1, book2};
        Library library = new Library(books);

//        for (int i = 0; i<books.length; i++){
//            System.out.println(books[i]);
//        }



    }
}
