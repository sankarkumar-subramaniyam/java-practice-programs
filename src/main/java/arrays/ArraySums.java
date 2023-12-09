package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraySums {

    public static void main(String[] args) {
        ArraySums arraySums = new ArraySums();
        arraySums.printArray(arraySums.twoSum(new int[]{2, 7, 11, 15}, 9));
        arraySums.printArray(arraySums.twoSum(new int[]{3, 2, 4}, 6));
        arraySums.printArray(arraySums.twoSum(new int[]{3, 3}, 6));
        arraySums.printArray(arraySums.twoSum(new int[]{3, 2, 3}, 6));


        System.out.println();
        arraySums.printArray(arraySums.twoSumSorted(new int[]{2, 7, 11, 15}, 9));
        arraySums.printArray(arraySums.twoSumSorted(new int[]{3, 2, 4}, 6));
        arraySums.printArray(arraySums.twoSumSorted(new int[]{3, 3}, 6));
        arraySums.printArray(arraySums.twoSumSorted(new int[]{3, 2, 3}, 6));
        arraySums.printArray(arraySums.twoSumSorted(new int[]{2, 3, 4}, 6));
        arraySums.printArray(arraySums.twoSumSorted(new int[]{-1, 0}, -1));

        System.out.println();
        arraySums.printArray(arraySums.twoSumTwoPointers(new int[]{2, 7, 11, 15}, 9));
        arraySums.printArray(arraySums.twoSumTwoPointers(new int[]{3, 2, 4}, 6));
        arraySums.printArray(arraySums.twoSumTwoPointers(new int[]{3, 3}, 6));
        arraySums.printArray(arraySums.twoSumTwoPointers(new int[]{3, 2, 3}, 6));
        arraySums.printArray(arraySums.twoSumTwoPointers(new int[]{2, 3, 4}, 6));
        arraySums.printArray(arraySums.twoSumTwoPointers(new int[]{-1, 0}, -1));


        System.out.println("reverseArray: " + reverseArray(Arrays.asList(1, 4, 3, 2)));

    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> revArr = new ArrayList<>();
        System.out.println("a: " + a + " ; a.size():" + a.size());
        for (int i = a.size() - 1; i > 0; i--) {
            System.out.println("i: " + i + " ; a.get(i):" + a.get(i));
            revArr.add(i, a.get(i));
        }

        return revArr;

    }

    //https://leetcode.com/problems/two-sum/solutions/3619262/3-method-s-c-java-python-beginner-friendly/
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                if (numMap.get(complement) != i) {
                    return new int[]{i, numMap.get(complement)};
                } else {
                    // TODO: Need to fix for same number as compliment
                }
            }
        }

        return new int[]{}; // No solution found
    }

    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
    public int[] twoSumSorted(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int endIndex = numbers.length - 1;
        // pupolate the complement map with values less than target.

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i <= endIndex; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i + 1, map.get(complement) + 1};
            }
        }
        return new int[]{};
    }

    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/solutions/2128501/two-pointers-visual-explanation-java/
    public int[] twoSumTwoPointers(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (nums[l] + nums[r] != target) {
            if (nums[l] + nums[r] < target) l++;
            else r--;
        }

        return new int[]{l + 1, r + 1};
    }

    public void printArray(int[] arr) {
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
            if (i != arr.length - 1)
                System.out.print(",");
        }
        System.out.print("]");
    }
}
