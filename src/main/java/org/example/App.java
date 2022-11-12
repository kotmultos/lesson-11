package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int [] array = {-6, 9, 8, 7, 6, -1, 0, -10, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        SortUtils sortUtils = new SortUtils();
        int [] res = sortUtils.selectSort(array);
        System.out.println(Arrays.toString(res));

        int [] array2 = {-6, 9, 8, 7, 6, -1, 0, -10, 5, 4, 3, 2, 1};
        System.out.println(SearchUtils.linearSearch(array2, 1));
        System.out.println(SearchUtils.linearSearch(array2, 100));

        int [] res2 = sortUtils.selectSort(array2);
        System.out.println(Arrays.toString(res2));
    }
}
