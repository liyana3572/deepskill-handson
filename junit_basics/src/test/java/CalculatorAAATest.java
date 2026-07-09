import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAAATest {

    private Calculator calculator;

    @BeforeAll
    static void setupClass() {
        System.out.println("Starting Calculator test suite...");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("New Calculator instance created for test.");
    }

    @Test
    void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        // Arrange
        int a = -10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(-5, result);
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Calculator instance cleared after test.");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("Calculator test suite finished.");
    }
}