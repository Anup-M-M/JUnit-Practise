package example.org;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class TestException {

    @Test
    void testSortingArray_Exception(){

        // Without using assertThrows function
//        try{
//            SortingArray array = new SortingArray();
//            int[] unsortedArray = {3,1,4,2};
//            int[] sortedArray = array.sortingArray(unsortedArray);
//            for(int element : sortedArray){
//                System.out.print(element);
//            }
//            fail(); // explicitly failing
//        }catch (NullPointerException ex){
//            System.out.println("Null Pointer Exception generated");
//        }

        // Using assertThrows function
        SortingArray array = new SortingArray();
        int[] unsortedArray = {2,1,4,5};
        assertThrows(NullPointerException.class, () -> array.sortingArray(unsortedArray));

    }
}
