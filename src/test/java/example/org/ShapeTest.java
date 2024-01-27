package example.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    Shape shape = new Shape();

    @Test
    void testComputeSquareArea(){

        assertEquals(16, shape.computeSquareArea(4));

    }

    @Test
    void testComputeCircleArea(){

        assertEquals(78.55, shape.computeCircleArea(5), "Area of circle calculation is wrong");

    }


    @Test
    void testComputeCircleArea_Supplier(){

        // In assertEquals with Supplier Functional Interface is efficient because it only considers and evaluate the message if test case is failed.
        assertEquals(78.55, shape.computeCircleArea(5), () -> "Area of circle calculation is wrong");

    }

}