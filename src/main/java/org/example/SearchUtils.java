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

    public static int binarySearch(int [] array, int elem, int posA, int posB) {

        if (posB >= posA) {

            int centerIndex = posA + (posB - posA) / 2;

            if(array[centerIndex] == elem) {
                return centerIndex;
            }
            else if(elem < array[centerIndex]) {
                return binarySearch(array, elem, posA, centerIndex - 1);
            }
            else { // elem > (array[centerIndex] )
                return binarySearch(array, elem, centerIndex + 1, posB);
            }
        }
        return -1;
    }
}
