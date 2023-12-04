package leetcode;

import java.util.ArrayList;

//https://leetcode.com/problems/moving-average-from-data-stream/
//https://medium.com/root-node/moving-average-from-data-stream-774aefb72a2c
public class MovingAvgInStream {

    // initialize
    ArrayList<Integer> nums = new ArrayList<>();
    int windowSize = 0;

    public MovingAvgInStream(int size) {
        this.windowSize = size;
    }

    public static void main(String[] args) {
        MovingAvgInStream avgInStream = new MovingAvgInStream(5);

        System.out.println(avgInStream.next(1));
        System.out.println(avgInStream.next(2));
        System.out.println(avgInStream.next(3));
        System.out.println(avgInStream.next(4));
        System.out.println(avgInStream.next(5));

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
