import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortingAlgorithmsTests {

    //DataStructures for bubble sort
    @Test
    public void testBubbleSort1Sorted()
    {
        int[] testArr = {1,2,3,4};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4}, testArr);
    }
    @Test
    public void testBubbleSort2NotSortedSmall()
    {
        int[] testArr = {5,9,2,1,4};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {1,2,4,5,9}, testArr);
    }
    @Test
    public void testBubbleSort3NotSortedBig()
    {
        int[] testArr = {50,20,1,5,4,3,2,700,3,4,5,5,0};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {0, 1, 2, 3, 3, 4, 4, 5, 5, 5, 20, 50, 700}, testArr);
    }
    @Test
    public void testBubbleSort4Descending()
    {
        int[] testArr = {9,8,7,6,5,4,3,2,1};
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, testArr);
    }
    @Test
    public void testBubbleSort5Null()
    {
        int[] testArr = null;
        SortingAlgorithms.bubbleSort(testArr);
        assertArrayEquals(null, testArr);
    }


    @Test
    public void testInsertionSort1Sorted()
    {
        int[] testArr = {1,2,3,4};
        SortingAlgorithms.insertionSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4}, testArr);
    }
    @Test
    public void testInsertionSort2NotSortedSmall()
    {
        int[] testArr = {5,9,2,1,4};
        SortingAlgorithms.insertionSort(testArr);
        assertArrayEquals(new int[] {1,2,4,5,9}, testArr);
    }
    @Test
    public void testInsertionSort3NotSortedBig()
    {
        int[] testArr = {50,20,1,5,4,3,2,700,3,4,5,5,0};
        SortingAlgorithms.insertionSort(testArr);
        assertArrayEquals(new int[] {0, 1, 2, 3, 3, 4, 4, 5, 5, 5, 20, 50, 700}, testArr);
    }
    @Test
    public void testInsertionSort4Descending()
    {
        int[] testArr = {9,8,7,6,5,4,3,2,1};
        SortingAlgorithms.insertionSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, testArr);
    }
    @Test
    public void testInsertionSort5Null()
    {
        int[] testArr = null;
        SortingAlgorithms.insertionSort(testArr);
        assertArrayEquals(null, testArr);
    }


    @Test
    public void testSelectionSort1Sorted()
    {
        int[] testArr = {1,2,3,4};
        SortingAlgorithms.selectionSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4}, testArr);
    }
    @Test
    public void testSelectionSort2NotSortedSmall()
    {
        int[] testArr = {5,9,2,1,4};
        SortingAlgorithms.selectionSort(testArr);
        assertArrayEquals(new int[] {1,2,4,5,9}, testArr);
    }
    @Test
    public void testSelectionSort3NotSortedBig()
    {
        int[] testArr = {50,20,1,5,4,3,2,700,3,4,5,5,0};
        SortingAlgorithms.selectionSort(testArr);
        assertArrayEquals(new int[] {0, 1, 2, 3, 3, 4, 4, 5, 5, 5, 20, 50, 700}, testArr);
    }
    @Test
    public void testSelectionSort4Descending()
    {
        int[] testArr = {9,8,7,6,5,4,3,2,1};
        SortingAlgorithms.selectionSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, testArr);
    }
    @Test
    public void testSelectionSort5Null()
    {
        int[] testArr = null;
        SortingAlgorithms.selectionSort(testArr);
        assertArrayEquals(null, testArr);
    }


    @Test
    public void testPQueueSortSort1Sorted()
    {
        int[] testArr = {1,2,3,4};
        SortingAlgorithms.pQueueSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4}, testArr);
    }
    @Test
    public void testPQueueSort2NotSortedSmall()
    {
        int[] testArr = {5,9,2,1,4};
        SortingAlgorithms.pQueueSort(testArr);
        assertArrayEquals(new int[] {1,2,4,5,9}, testArr);
    }
    @Test
    public void testPQueueSort3NotSortedBig()
    {
        int[] testArr = {50,20,1,5,4,3,2,700,3,4,5,5,0};
        SortingAlgorithms.pQueueSort(testArr);
        assertArrayEquals(new int[] {0, 1, 2, 3, 3, 4, 4, 5, 5, 5, 20, 50, 700}, testArr);
    }
    @Test
    public void testPQueueSort4Descending()
    {
        int[] testArr = {9,8,7,6,5,4,3,2,1};
        SortingAlgorithms.pQueueSort(testArr);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, testArr);
    }
    @Test
    public void testPQueueSort5Null()
    {
        int[] testArr = null;
        SortingAlgorithms.pQueueSort(testArr);
        assertArrayEquals(null, testArr);
    }








}