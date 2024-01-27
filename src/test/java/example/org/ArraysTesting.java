package example.org;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTesting {

    @Test
    void testArrays(){

        int[] expected = {2,4,6,8};

        int[] actual = {4,8,2,6};

        Arrays.sort(actual);

        assertArrayEquals(expected, actual);

      //assertEquals(expected,actual); //fails bcz it checks the arrays object reference
    }
}
