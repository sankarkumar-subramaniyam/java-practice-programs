/**
 *
 */
package arrays.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author Sankar
 */
public class Binary {


    /**
     * @param args
     */
    public static void main(String[] args) {

        Binary binary = new Binary();
        System.out.println(binary.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(binary.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
        System.out.println(binary.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 10));
        System.out.println(binary.search(new int[]{10}, 10));
        System.out.println(binary.search(new int[]{100, 100}, 10));
        System.out.println(binary.search(new int[]{100, 12, 10}, 10)); // this will return false because it's not sorted.

        //Collections.sort();
        //Arrays.sort();
        System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println("Collections.binarySearch: " + Collections.binarySearch(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}).boxed().collect(Collectors.toList()), 10));
    }

    private boolean search(int[] inputArray, int find) {
        boolean isFound = false;

        int start = 0;
        int end = inputArray.length - 1;

        while (start <= end) {
            int mid = (start + end) >>> 1;

            if (find == inputArray[mid]) {
                isFound = true;
                break;
            }

            if (find < inputArray[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return isFound;
    }

}
