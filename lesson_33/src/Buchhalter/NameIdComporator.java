package Buchhalter;

import java.util.Comparator;

public class NameIdComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName()) == 0
                ? Integer.compare(o1.getId(), o2.getId())
                : o1.getName().compareTo(o2.getName());
    }
}
