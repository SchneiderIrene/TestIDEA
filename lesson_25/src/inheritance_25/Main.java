package inheritance_25;

public class Main {
    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();
        Main m = new Main();
        C objectC = new C();

        System.out.println(objectA instanceof  A);
        System.out.println(objectB instanceof  A);
        System.out.println(objectA instanceof  B);


        JavaTeacher javaTeacher = new JavaTeacher();
        System.out.println(javaTeacher.getProfession());
        System.out.println(javaTeacher.getSchool());

    }

}
