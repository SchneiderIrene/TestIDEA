package built_in_interfaces;

public class MethodReference {

    public static void main(String[] args) {

        int[]ints = {-6, -2, 1, 3, 4, 6};
        ExampleClass exampleClass = new ExampleClass();
        System.out.println(findSumCondition(ints, exampleClass::isPositive));
        System.out.println(findSumCondition(ints, ExampleClass::isEven));

        PersonCreator personCreator = Person::new;
        Person person = personCreator.create("John");
        System.out.println(person.getName());
        System.out.println(person);

    }

    public static int findSumCondition (int[]ints, ExampleInterface exampleInterface){
        int sum = 0;

        for (int i: ints){
            if(exampleInterface.isEqual(i)){
                sum += i;
            }
        }
        return sum;
    }


}
