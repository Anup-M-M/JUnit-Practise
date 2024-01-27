package example.org;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InstanceTest {

    InstanceTest(){
        System.out.println("Test Object is created before test method");
    }

    @BeforeAll // In JUnit 4 it is @BeforeClass
    void beforeAll(){
        System.out.println("BeforeAll test ");
    }

    @AfterAll // In JUnit 4 it is @AfterClass
    void afterAll(){
        System.out.println("AfterAll test");
    }

    Shape shape;

    @BeforeEach
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

    @AfterEach
    void destroy(){
        System.out.println("After test clean up");
    }

}
