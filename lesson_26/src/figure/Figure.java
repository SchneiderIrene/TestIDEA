package figure;

public class Figure {
     private String name;

    public Figure(String name) {
        this.name = name;
    }

    public double findArea (){
        return 0.0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name = " + name;
    }
}
