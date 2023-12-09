package leetcode;

import java.util.*;

public class ArrayTricks {

    public static void main(String[] args) {
        ArrayTricks arrayTricks = new ArrayTricks();
//        arrayTricks.kidsWithCandies(new int[]{2,3,5,1,3},3);
//        arrayTricks.kidsWithCandies(new int[]{4,2,1,1,2},1);
//        arrayTricks.kidsWithCandies(new int[]{12,1,12},10);


//        System.out.println(arrayTricks.canPlaceFlowers(new int[]{1,0,0,0,1},1));
//        System.out.println(arrayTricks.canPlaceFlowers(new int[]{1,0,0,0,1},2));
//        System.out.println(arrayTricks.canPlaceFlowers(new int[]{1,0,0,0,0,0,1},2));

//        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
//        arrayTricks.rotate(nums, 3);
//        for (int i : nums) {
//            System.out.print(i + ",");
//        }
//        System.out.println(" ");
//
//
//        nums = new int[]{-1, 3};
//        arrayTricks.rotate(nums, 3);


        //arrayTricks.printArrays(arrayTricks.moveZeroes(new int[]{0,1,0,3,12}));
        //arrayTricks.printArrays(arrayTricks.moveZeroes(new int[]{1,0,1}));

//        System.out.println(" "+arrayTricks.findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
//        System.out.println(" "+arrayTricks.findMaxAverage(new int[]{5},1));
//        System.out.println(" "+arrayTricks.findMaxAverage(new int[]{-1},1));

        System.out.println(" " + arrayTricks.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));

//        Comparator.reverseOrder();
//        Collections.reverseOrder();
    }

    // https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75
    public boolean uniqueOccurrences(int[] arr) {
        // Hava a HashMap counter
        // check the counter for dublicate and return.

        HashMap<Integer, Integer> counterMap = new HashMap<>();
        HashSet<Integer> dubCheck = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            counterMap.put(arr[i], counterMap.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer count : counterMap.values()) {
            if (!dubCheck.add(count))
                return false;
        }

        return true;
    }

    // https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75
    // Returns the elements in the first arg nums1 that don't exist in the second arg nums2.
    List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<>();

        // Store nums2 elements in an unordered set.
        Set<Integer> existsInNums2 = new HashSet<>();
        for (int num : nums2) {
            existsInNums2.add(num);
        }

        // Iterate over each element in the list nums1.
        for (int num : nums1) {
            if (!existsInNums2.contains(num)) {
                onlyInNums1.add(num);
            }
        }

        // Convert to vector.
        return new ArrayList<>(onlyInNums1);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }

    // https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
    public double findMaxAverage(int[] nums, int k) {
        //Integer.MIN_VALUE
        // fail if k is more than the length of arr
        if (k > nums.length) {
            return -1.0;
        }

        // create a cumulative sum arry
        int[] sumsOfNums = new int[nums.length];
        sumsOfNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumsOfNums[i] = sumsOfNums[i - 1] + nums[i];
        }

        double maxAvg = (sumsOfNums[k - 1] * 1.0) / k;
        for (int i = k; i < nums.length; i++) {
            maxAvg = Math.max(maxAvg, (((sumsOfNums[i] - sumsOfNums[i - k]) * 1.0) / k));
        }

        return maxAvg;
    }

    void printArrays(int[] nums) {
        for (int i : nums) {
            System.out.print(i + ",");
        }
        System.out.println(" ");
    }

    public int[] moveZeroes(int[] nums) {

        // Two pointers starts with 0
        // compare and swap
        // otherwise increment

        int i = 0;
        int j = 0;

        while (i <= nums.length - 1 && j <= nums.length - 1) {
            if (i == j) {
                j++;
                continue;
            }

            if (0 != nums[i]) {
                i++;
                continue;
            }

            if (0 == nums[j]) {
                j++;
                continue;
            }

            if (0 == nums[i]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            i++;
            j++;
        }
        return nums;
    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find greatest num
        // add extra candies and set flag for the each kid

        ArrayList<Boolean> gncKids = new ArrayList<>();
        int greatestInArr = 0;
        for (int i = 0; i < candies.length; i++) { // O(N)
            greatestInArr = Math.max(greatestInArr, candies[i]);
        }

        for (int i = 0; i < candies.length; i++) { // O(N)
            gncKids.add(greatestInArr <= (candies[i] + extraCandies));
        }

        System.out.println(gncKids);

        return gncKids;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // loop whole array once
        // for each index, check next 3 indexes are 0,
        // if yes, decrement n--;
        // if no, move to next index with value 1
        // repeat the same.

        if (flowerbed.length <= 2 && n > 0) {
            return false;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (1 == flowerbed[i]) {
                // next three
                int size = flowerbed.length - i;
                if (size >= 3) {
                    if ((0 == flowerbed[i + 1]) && (0 == flowerbed[i + 2]) && (0 == flowerbed[i + 3])) {
                        n--;
                        i += 3;
                    }
                }
                if (size == 2) {
                    if ((0 == flowerbed[i + 1]) && (0 == flowerbed[i + 2]))
                        n--;
                }
            } else {

            }
        }

        // end of the loop if n==o, return true.
        return 0 == n;
    }

    public void rotate(int[] nums, int k) {

        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i + k ; " + ((i + k)) + "; len: " + nums.length + "; index: " + ((i + k) % nums.length));
            a[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(a, 0, nums, 0, nums.length);

    }

}
