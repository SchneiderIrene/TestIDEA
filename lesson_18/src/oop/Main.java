package oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 30;
        System.out.println("Person's 1 name is " + person1.name);
        System.out.println(person1.name + "'s age is " + person1.age);
        person1.canWalk();

        System.out.println("--------------------------------------------");

        Person person2 = new Person();
        person2.name = "Kate";
        person2.age = 20;
        System.out.println("Person's 2 name is " + person2.name);
        System.out.println(person2.name + "'s age is " + person2.age);
        person2.canWalk();

        System.out.println("--------------------------------------------");

        Person person3 = new Person("Jack", 60);
        System.out.println("Person's 3 name is " + person3.name);
        System.out.println(person3.name + "'s age is " + person3.age);
        person3.canWalk();

        System.out.println("--------------------------------------------");

        Person person4 = new Person();
        System.out.println("Person's 4 name is " + person4.name);
        System.out.println(person4.name + "'s age is " + person4.age);
        person4.canWalk();

        System.out.println("--------------------------------------------");

        Person person5 = new Person("Bill", 45, 180);
        System.out.println("Person's 5 name is " + person5.name);
        System.out.println(person5.name + "'s age is " + person5.age);
        System.out.println(person5.name + "'s height is " + person5.height);
        person5.canWalk();




    }
}
