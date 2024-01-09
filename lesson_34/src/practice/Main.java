package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jack", "London", "White Fang", 1905);
        Author author2 = new Author("Michail", "Bulgakov", "White Guard", 1920);
        Author author3 = new Author("Ray", "Bradbury", "Fahrenheit 451", 1953);

        Author[]authors = {author1, author2, author3};
        Arrays.sort(authors);
        for (Author author: authors){
            System.out.println(author);
        }
    }
}
