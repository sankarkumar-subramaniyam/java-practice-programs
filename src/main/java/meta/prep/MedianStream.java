package meta.prep;


import java.util.Collections;
import java.util.PriorityQueue;
// Add any extra import statements you may need here


class MedianStream {

    // Add any helper functions you may need here


    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom.
    int test_case_number = 1;
    private final PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private final PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;

    public static void main(String[] args) {
        new MedianStream().run();
    }

    int[] findMedian(int[] arr) {
        // Write your code here

        //https://leetcode.com/problems/find-median-from-data-stream/solutions/
        //https://www.baeldung.com/java-stream-integers-median-using-heap
        return null;
    }

    public double findMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }

    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }

    void check(int[] expected, int[] output) {
        int expected_size = expected.length;
        int output_size = output.length;
        boolean result = expected_size == output_size;
        for (int i = 0; i < Math.min(expected_size, output_size); i++) {
            result &= (output[i] == expected[i]);
        }
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printIntegerArray(expected);
            System.out.print(" Your output: ");
            printIntegerArray(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printIntegerArray(int[] arr) {
        int len = arr.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    public void run() {
        int[] arr_1 = {5, 15, 1, 3};
        int[] expected_1 = {5, 10, 5, 4};
        int[] output_1 = findMedian(arr_1);
        check(expected_1, output_1);

        int[] arr_2 = {2, 4, 7, 1, 5, 3};
        int[] expected_2 = {2, 3, 4, 3, 4, 3};
        int[] output_2 = findMedian(arr_2);
        check(expected_2, output_2);

        // Add your own test cases here

    }
}