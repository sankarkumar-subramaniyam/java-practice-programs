package leetcode;

public class TwoPointers {

    public static void main(String[] arg) {
        TwoPointers twoPointers = new TwoPointers();
//        twoPointers.printWithWindowSize(2, new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7});
//        twoPointers.printWithWindowSize(3, new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7});
//        twoPointers.printWithWindowSize(5, new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7});
//        twoPointers.printWithWindowSize(5, new int[]{1, 1, 2, 2, 3, 3, 4});
//
//        twoPointers.printWithWindowSize(2, "AABBCCDDEEFFGGHH");
//        twoPointers.printWithWindowSize(4, "AABBCCDDEEFFGGHH");
//        twoPointers.printWithWindowSize(6, "AABBCCDDEEFFGGHH");
//        twoPointers.printWithWindowSize(8, "AABBCCDDEEFFGGHH");

//        twoPointers.getMaxSumOfWindow(2, new int[]{1, 1, 2, 20, 3, 3, 4, 4, 5, 5, 6, 6, 7});
//        twoPointers.getMaxSumOfWindow(3, new int[]{1, 100, 2, 2, 30, 3, 4, 4, 50, 5, 6, 6, 7});
//        twoPointers.getMaxSumOfWindow(5, new int[]{100, 1, 2, 12, 3, 3, 4, 4, 15, 5, 6, 6, 7});
//        twoPointers.getMaxSumOfWindow(4, new int[]{1, 1, 200, 12, 3, 3, 4});

//        twoPointers.getAvgOfWindow(2, new int[]{1, 1, 2, 20, 3, 3, 4, 4, 5, 5, 6, 6, 7});
//        twoPointers.getAvgOfWindow(3, new int[]{1, 100, 2, 2, 30, 3, 4, 4, 50, 5, 6, 6, 7});
//        twoPointers.getAvgOfWindow(5, new int[]{100, 1, 2, 12, 3, 3, 4, 4, 15, 5, 6, 6, 7});
//        twoPointers.getAvgOfWindow(4, new int[]{1, 1, 200, 12, 3, 3, 4});

        twoPointers.getAvgOfWindow(2, new int[]{100, 20, 30, 40});

        twoPointers.mergeAlternately("abc", "pqr");
    }

    public int getAvgOfWindow(int windowSize, int[] nums) {
        int left = 0;
        int right = left + windowSize;
        int maxAvg = -1;

        while (right <= nums.length) {
            int sumOfWindow = 0;

            for (int i = left; i < right; i++) {
                sumOfWindow += nums[i];
            }

            int avg = sumOfWindow / windowSize;

            System.out.println("Ave of the Window is " + avg);
            maxAvg = Math.max(maxAvg, avg);
            right++;
            left++;
        }
        System.out.println("MAx Ave of the Window is " + maxAvg);
        return maxAvg;
    }

    public int getMaxSumOfWindow(int windowSize, int[] nums) {
        int maxSum = -1;

        int left = 0;
        int right = left + windowSize;

        while (right <= nums.length) {
            int sumOfWindow = 0;

            for (int i = left; i < right; i++) {
                sumOfWindow += nums[i];
            }
            System.out.println("Sum of the window: " + sumOfWindow);
            maxSum = Math.max(maxSum, sumOfWindow);
            left++;
            right++;
        }
        System.out.println("------------- Max Sum of the window: " + maxSum);
        return maxSum;
    }

    public void printWithWindowSize(int windowSize, String str) {
        int left = 0;
        int right = left + windowSize;

        while (right <= str.length()) {
            System.out.println(str.substring(left, right));
            left++;
            right++;
        }
    }

    public void printWithWindowSize(int windowSize, int[] nums) {
        // Left pointer
        int left = 0;
        // Right pointer
        int right = left + windowSize;
        while (right <= nums.length) {
            // Window start position is left
            // Window end position is right
            System.out.println();
            System.out.print("[ ");
            for (int i = left; i < right; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.print("]");

            left++;
            right++;
        }
    }

    //    https://leetcode.com/problems/merge-strings-alternately/description/
    public String mergeAlternately(String word1, String word2) {
        char[] mergedChars = new char[word1.length() + word2.length()];

        int left = 0;
        int right = 0;
        int mergeIndex = 0;

        while (left < word1.length() && right < word2.length()) {
            mergedChars[mergeIndex++] = word1.charAt(left);
            mergedChars[mergeIndex++] = word2.charAt(right);
            left++;
            right++;
        }

        // Copy all remaining from left
        while (left < word1.length()) {
            mergedChars[mergeIndex++] = word1.charAt(left);
            left++;
        }

        // Copy all remaining from right
        while (right < word2.length()) {
            mergedChars[mergeIndex++] = word2.charAt(right);
            right++;
        }

        return new String(mergedChars);
    }
}
