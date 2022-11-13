package org.example;

public class SearchUtils {

    public static int linearSearch(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == elem) {
                return i;
            }
        }

        return -1;
    }

    public static int[] binarySearch(int [] array, int elem) {
        return array;
    }
}
