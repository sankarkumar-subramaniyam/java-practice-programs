package arrays;

import java.util.HashMap;

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
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
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
