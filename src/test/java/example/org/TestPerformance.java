package example.org;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TestPerformance {

    @Test
    void testSortingArray_Performance(){
        SortingArray array = new SortingArray();
        int[] unsortedArray = {2,5,1};
        // assertTimeout - check the performance of particular unit
        assertTimeout(Duration.ofMillis(100), () -> array.sortingArray_Performance(unsortedArray));
    }
}
