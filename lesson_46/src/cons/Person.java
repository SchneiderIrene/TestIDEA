package cons;

import java.util.List;

public class Person {
    private String name;
    private List<BankAccount2> ibans;

    public Person(String name, List<BankAccount2> ibans) {
        this.name = name;
        this.ibans = ibans;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount2> getIbans() {
        return ibans;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ibans=" + ibans +
                '}';
    }
}
