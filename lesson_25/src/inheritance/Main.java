package inheritance;

public class Main {
    public static void main(String[] args) {

      JavaTeacher javaTeacher = new JavaTeacher();
        System.out.println(javaTeacher.prof);
        System.out.println(javaTeacher.school);
        System.out.println(javaTeacher.spec);
        javaTeacher.teaches();

        System.out.println("------------------------------------");

        SubClass subClass = new SubClass("Java", 55);

    }
}