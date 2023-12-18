package cons;

public class Boy {
    private  Person person;
    int height;

    public Boy(Height height) {
        this.person = new Person(height);
    }

    public Boy(int height) {
        this.person = new Person(new Height(height, "cm"));
    }

    public int getPerson() {
        return person.getHeight().height;
    }


    public Height getNewHeight() {
        return person.getHeight();
    }
}
