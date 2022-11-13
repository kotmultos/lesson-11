package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortUtilsTest {
    private final SortUtils sortUtils = new SortUtils();
    @Test
    public void testBubbleSort_emptyArray() {
        int[] array = {};
        assertArrayEquals(new int[] {}, sortUtils.bubbleSort(array));
    }

    @Test
    public void testBubbleSort_sameElements() {
        int[] array = {33, 33, 33, 66, 66, 66, -10, -10, -10, 0, 0, 0};
        int[] arrayExpectedResult = {-10, -10, -10, 0, 0, 0, 33, 33, 33, 66, 66, 66};
        assertArrayEquals(arrayExpectedResult, sortUtils.bubbleSort(array));
    }

    @Test
    public void testBubbleSort_ordinaryCase() {
        int[] array = {45, 87, 0, -6, -94};
        int[] arrayExpectedResult = {-94, -6, 0, 45, 87};
        assertArrayEquals(arrayExpectedResult, sortUtils.bubbleSort(array));
    }

    @Test
    public void testBubbleSort_notOrdinaryCase() {
        int[] array = {45, 87, 0, -6, 0,  87, -94};
        int[] arrayExpectedResult = {-94, -6, 0, 0, 45, 87, 87};
        assertArrayEquals(arrayExpectedResult, sortUtils.bubbleSort(array));
    }
}