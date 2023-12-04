package interview;

import java.util.ArrayList;


// https://leetcode.com/problems/moving-average-from-data-stream/description/
public class MovingAverage {

    // initialize
    ArrayList<Integer> nums = new ArrayList<>();
    int windowSize = 0;

    public MovingAverage(int size) {
        this.windowSize = size;
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        double out_1 = movingAverage.next(1); // return 1.0 = 1 / 1
        double out_2 = movingAverage.next(10); // return 5.5 = (1 + 10) / 2
        double out_3 = movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
        double out_4 = movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3

        System.out.println(out_1);
        System.out.println(out_2);
        System.out.println(out_3);
        System.out.println(out_4);


    }

    public double next(int val) {
        nums.add(val);
        int sum = 0;
        for (int i = Math.max(0, (nums.size() - windowSize)); i < nums.size(); i++) {
            sum = sum + nums.get(i);
        }
        int numsSize = Math.min(nums.size(), windowSize);
        double avg = ((double) sum / numsSize);
        return avg;
    }
}
