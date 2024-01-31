package cons_cast_collector;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", 4000);
        Employee emp2 = new Employee("Jack", 2500);
        Employee emp3 = new Employee("Ann", 3500);




        Supplier<Box> supplier = () -> {
            System.out.println("Supplying starting value");
            return new Box(0);
        };

        BiConsumer<Box, Employee> accumulator = (result, employee) -> {
           result.setValue (result.getValue() + employee.getSalary());
            System.out.println(result.getValue() + " " + employee.getName());
        };

        BinaryOperator<Box> combiner = (res1, res2) -> {
            res1.setValue(res1.getValue() + res2.getValue());
            return res1;
        };

        Collector<Employee, Box, Box> collector = Collector.of(supplier, accumulator,combiner);
       Box box =  Stream.of(emp1, emp2, emp3)
                .parallel()
                .collect(collector);
        System.out.println(box);
    }


}
