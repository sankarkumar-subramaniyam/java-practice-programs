package arrays;


import javafx.util.Pair;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Pair<Integer, Integer>> mp = new HashMap<>();
        HashMap<Integer, Boolean> bl = new HashMap<>();
        int mx = 0;

        for (int i : nums) {
            if (bl.containsKey(i)) {
                continue;
            }
            bl.put(i, true);
            int l = i, r = i;

            if (mp.containsKey(i + 1)) {
                r = mp.get(i + 1).getKey();
            }
            if (mp.containsKey(i - 1)) {
                l = mp.get(i - 1).getValue();
            }
            mp.put(r, new Pair<>(r, l));
            mp.put(l, new Pair<>(r, l));
            mx = Math.max(mx, r - l + 1);
        }

        return mx;
    }

    /**
     public int longestConsecutive(int[] nums) {

     HashMap<Integer,HashSet<Integer>> mapOfConsecutives = new HashMap<>();

     if(nums.length == 1){
     return 1;
     }
     else if(nums.length > 1){
     for(int i =0; i < nums.length ; i++){
     mapOfConsecutives.put(nums[i], new HashSet<Integer>());
     }
     }
     else {
     return 0;
     }


     int longestConsecutive = 0;
     for(int i =0; i<nums.length; i++){
     int num = nums[i];
     mapOfConsecutives.get(num).add(num);
     for (int j= num + 1 ; j < (num + nums.length);j++){
     if(mapOfConsecutives.containsKey(j)) {
     mapOfConsecutives.get(num).add(j);
     }
     }
     int consecutiveForNum = (mapOfConsecutives.get(num)).size();
     if(consecutiveForNum > longestConsecutive){
     longestConsecutive = consecutiveForNum;
     }
     }

     return longestConsecutive;
     }
     **/
}
