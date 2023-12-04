package oop;

public class Person {
    String name;
    int age;
    int height;

    public Person (){
        name = "Undefined";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void canWalk (){
        System.out.println( name + " can walk");
        System.out.println(name + " is " + age + " years old" );
    }

    public Person (String name, int age, int height){
         this.name = name;
         this.age = age;
         this.height = height;
    }
}
