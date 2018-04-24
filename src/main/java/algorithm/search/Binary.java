/**
 *
 */
package algorithm.search;

/**
 * @author Sankar
 */
public class Binary {


    private boolean search(int[] inputArray, int find) {
        boolean isFound = false;

        int start = 0;
        int end = inputArray.length ;

        while (start < end) {
            int mid = start + end - 1;

            if (find == inputArray[mid])
                isFound = true;

            if (find < inputArray[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return isFound;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {

        Binary binary = new Binary();
        System.out.println(binary.search(new  int[]{1,2,3,4,5,6,7,8,9,10}, 10));
        System.out.println(binary.search(new  int[]{1,2,3,4,5,6,7,8,9}, 10));
        System.out.println(binary.search(new  int[]{0,1,2,3,4,5,6,7,8,9,10,11,12}, 10));
        System.out.println(binary.search(new  int[]{10}, 10));
        System.out.println(binary.search(new  int[]{100,100}, 10));
        System.out.println(binary.search(new  int[]{100,12,10}, 10));

    }

}
