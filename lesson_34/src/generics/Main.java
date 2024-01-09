package generics;

public class Main {
    public static void main(String[] args) {
        Person<Integer> person1 = new Person<>("John", 1);
        Person<String> person2 = new Person<>("Jack", "2");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());

        Display display = new Display();
        Integer [] ints = {1,2,3,4,5,6,7,8,9};
        display.display(ints);

        String [] strings = {"Tom", "Jack", "John"};
        display.display(strings);

        Person2<Integer, String> person21 = new Person2<>("John", 35);


    }
}
