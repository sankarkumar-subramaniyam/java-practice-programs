package meta.prep;

import java.util.Collections;
import java.util.PriorityQueue;

//https://leetcode.com/discuss/interview-question/1184501/facebook-recruiting-portal-magical-candy-bags
public class MagicalCandyBags {

    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom.
    int test_case_number = 1;

    public static void main(String[] args) {
        new MagicalCandyBags().run();
    }

    int maxCandies(int[] arr, int k) {
        // Write your code here
        PriorityQueue<Integer> maxValue = new PriorityQueue<>(Collections.reverseOrder());

        //nlog(n)
        for (int i : arr) {
            maxValue.add(i);
        }


        //klog(k);
        int sum = 0;
        while (k > 0) {
            int cur = maxValue.poll();
            sum += cur;
            maxValue.add(cur / 2);
            k--;
        }

        return sum;
    }

    void check(int expected, int output) {
        boolean result = (expected == output);
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printInteger(expected);
            System.out.print(" Your output: ");
            printInteger(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printInteger(int n) {
        System.out.print("[" + n + "]");
    }

    public void run() {
        int n_1 = 5, k_1 = 3;
        int[] arr_1 = {2, 1, 7, 4, 2};
        int expected_1 = 14;
        int output_1 = maxCandies(arr_1, k_1);
        check(expected_1, output_1);

        int n_2 = 9, k_2 = 3;
        int[] arr_2 = {19, 78, 76, 72, 48, 8, 24, 74, 29};
        int expected_2 = 228;
        int output_2 = maxCandies(arr_2, k_2);
        check(expected_2, output_2);

        // Add your own test cases here

    }
}
