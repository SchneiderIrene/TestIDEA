package cons;

public class Main2 {
    public static void main(String[] args) {
        Transformable transformable = string -> string.toUpperCase();
        System.out.println(transformable.modify("Java forever"));

        Checkable checkable = string -> string.length()==3;
        System.out.println(checkable.check("Jav"));
    }
}
