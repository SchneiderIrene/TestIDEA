package super_keywort;

public class SubClass extends ParentClass{
    int i = 5;

    public SubClass() {
        super("Hello");
        System.out.println("Constructor of the Sub Class was called ");
    }

    public SubClass(int i) {
        super("Hello2");
        this.i = i;
    }

    public void print (){
        System.out.println(i);
    }
    public void printI (){
        System.out.println(super.i);
    }

    public void printJ (){
        System.out.println(j);
    }

    @Override
    public void printSmth() {
        System.out.println("Child Class Method");
    }

    public void  display (){
        printSmth();
        super.printSmth();
    }
}
