package example.org;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBeforeAfter {

    Shape shape;

    @BeforeEach // In JUnit 4 it is @Before
    void init(){
        shape = new Shape();
        System.out.println("Before test");
    }

    @Test
    void testComputeSquareArea() {
        assertEquals(16, shape.computeSquareArea(4));
        System.out.println("Actual test is running");
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(78.55, shape.computeCircleArea(5), "Area of circle calculation is wrong");
        System.out.println("Actual test is running");
    }

    @AfterEach // In JUnit 4 it is @After
    void destroy(){
        System.out.println("After test clean up");
    }

}
