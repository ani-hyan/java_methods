package homework_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {
    SortingAlgorithms a;
    int[] arr;

    @BeforeEach
    void setUp() {
        a = new SortingAlgorithms();
        arr = new int[]{4, 3, 3, 6, -2, 1, 4};
    }

    @Test
    @DisplayName("Test for Bubble sort")
    void bubbleSortTest() {
        int[] sorted = {-2, 1, 3, 3, 4, 4, 6};
        assertArrayEquals(sorted, a.bubbleSort(arr));
    }

    @Test
    @DisplayName("Test for Selection sort")
    void selectionSortTest() {
        int[] sorted = {-2, 1, 3, 3, 4, 4, 6};
        assertArrayEquals(sorted, a.selectionSort(arr));
    }

    @Test
    @DisplayName("Test for Insertion sort")
    void insertionSortTest() {
        int[] sorted = {-2, 1, 3, 3, 4, 4, 6};
        assertArrayEquals(sorted, a.insertionSort(arr));
    }

    @Test
    @DisplayName("Test for Merge sort")
    void mergeSortTest() {
        int[] expected = {-2, 1, 3, 3, 4, 4, 6};
        a.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Test for Quick sort")
    void quickSortTest() {
        int[] expected = {-2, 1, 3, 3, 4, 4, 6};
        a.quickSort(arr);
        assertArrayEquals(expected, arr);
    }
}