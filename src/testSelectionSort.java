//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

//class testSelectionSort {

//	@Test
	//void test() {
	//	fail("Not yet implemented");
	//}

//}

/* import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class testSelectionSort {

    @Test
    public void testPositive() {
        int[] arr = { 8, 9, 7, 10, 2 };
        int[] sortedArr = { 2, 7, 8, 9, 10 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testNegative() {
        int[] arr = { -5, -8, -2, -10, -3 };
        int[] sortedArr = { -10, -8, -5, -3, -2 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testMixed() {
        int[] arr = { 4, -2, 0, 7, -1 };
        int[] sortedArr = { -2, -1, 0, 4, 7 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testDuplicates() {
        int[] arr = { 3, 5, 2, 5, 8, 3 };
        int[] sortedArr = { 2, 3, 3, 5, 5, 8 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);

        // Additional check for duplicates
        assertTrue(result[2] == result[3]); // Check if the third and fourth elements are equal
    }
}*/ 



import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class testSelectionSort {

    @Test
    public void testPositive() {
        int[] arr = { 8, 9, 7, 10, 2 };
        int[] sortedArr = { 2, 7, 8, 9, 10 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testNegative() {
        int[] arr = { -5, -8, -2, -10, -3 };
        int[] sortedArr = { -10, -8, -5, -3, -2 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);
    }

    @Test
    public void testMixed() {
        int[] arr = { 4, -2, 0, 7, -1 };
        int[] sortedArr = { -2, -1, 0, 4, 7 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);
    }

   /* @Test
    public void testDuplicates() {
        int[] arr = { 3, 5, 2, 5, 8, 3 };
        int[] sortedArr = { 2, 3, 3, 5, 5, 8 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);

        // Additional check for duplicates
        assertTrue(result[2] == result[3]); // Check if the third and fourth elements are equal
    }
}*/
    
    @Test
    public void testDuplicates() {
        int[] arr = { 3, 5, 2, 5, 8, 3 };
        int[] sortedArr = { 2, 3, 3, 5, 5, 8 };

        SelectionSort sorter = new SelectionSort();
        int[] result = sorter.basicSelectionSort(arr);

        assertArrayEquals(sortedArr, result);

        // Additional check for duplicates
        for (int i = 0; i < result.length - 1; i++) {
            assertTrue(result[i] <= result[i + 1]);
        }
    }
}


