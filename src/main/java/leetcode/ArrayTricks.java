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

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        arrayTricks.rotate(nums, 3);
        for (int i : nums) {
            System.out.print(i + ",");
        }
        System.out.println(" ");


        nums = new int[]{-1, 3};
        arrayTricks.rotate(nums, 3);
        for (int i : nums) {
            System.out.print(i + ",");
        }
        System.out.println(" ");
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
