package unit_testing;

public class Main {

    // @BeforeEach - метод будет выполняться перед каждым тестовым методом тестового класса,
    // @DisplayName - для определения названия теста,
    // @AfterEach - метод будет выполняться после каждого тестового метода,
    // @BeforeAll - перед всеми тестовыми методами,
    // @AfterAll - после всех,
    // @Test - становится тестовым методом.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(2,3));
    }

}
