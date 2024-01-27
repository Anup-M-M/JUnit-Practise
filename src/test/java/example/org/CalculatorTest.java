package example.org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
     void test() {

        Calculator c = new Calculator();

        assertEquals(2, c.divide(10, 5));

        assertEquals(5, c.divide(10, 2));

    }

}