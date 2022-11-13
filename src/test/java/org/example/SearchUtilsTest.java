package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchUtilsTest {

    @Test
    public void testBinarySearch_ordinaryEvenCount() {
        int [] array = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        assertEquals(2, SearchUtils.binarySearch(array, -3, 0, array.length - 1));
    }

    @Test
    public void testBinarySearch_ordinaryNotEvenCount() {
        int [] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        assertEquals(2, SearchUtils.binarySearch(array, -3, 0, array.length - 1));
    }

    @Test
    public void testBinarySearch_notSuchElementRight() {
        int [] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        assertEquals(-1, SearchUtils.binarySearch(array, 100, 0, array.length - 1));
    }

    @Test
    public void testBinarySearch_notSuchElementLeft() {
        int [] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        assertEquals(-1, SearchUtils.binarySearch(array, -20, 0, array.length - 1));
    }
}