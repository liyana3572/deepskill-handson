import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }

    @Test
    public void testAssertThrows() {
        // Bonus: demonstrates exception assertion, common in real test suites
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }

    @Test
    public void testAssertAll() {
        // Bonus: groups related assertions so ALL run even if one fails
        Calculator calculator = new Calculator();
        assertAll("calculator",
                () -> assertEquals(5, calculator.add(2, 3)),
                () -> assertEquals(0, calculator.add(-2, 2)),
                () -> assertEquals(-5, calculator.add(-2, -3))
        );
    }
}