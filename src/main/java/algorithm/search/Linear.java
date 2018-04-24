/**
 *
 */
package algorithm.search;

/**
 * @author Sankar
 */
public class Linear {

    private boolean search(int[] inputArray, int find) {
        boolean isFound = false;

        for (int i = 0; i < inputArray.length; i++) {
            if (find == inputArray[i])
                isFound = true;
        }

        return isFound;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Linear linear = new Linear();

        System.out.println(linear.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(linear.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
        System.out.println(linear.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 10));
        System.out.println(linear.search(new int[]{10}, 10));
        System.out.println(linear.search(new int[]{100, 100}, 10));
        System.out.println(linear.search(new int[]{100, 12, 10}, 10));

    }

}
