package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        //Input: strs = ["eat","tea","tan","ate","nat","bat"]
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        HashMap<String, ArrayList<String>> groupedAnagrams = new HashMap<>();
        List<List<String>> groupAnagramsOut = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] sortedChars = strs[i].toCharArray();
            Arrays.sort(sortedChars);
            System.out.println(sortedChars);

            String key = String.valueOf(sortedChars);
            if (groupedAnagrams.containsKey(key)) {
                groupedAnagrams.get(key).add(strs[i]);
            } else {
                ArrayList<String> values = new ArrayList<>();
                values.add(strs[i]);
                groupedAnagrams.put(key, values);
            }
        }

        groupedAnagrams.forEach((k, v) -> groupAnagramsOut.add(v));

        return groupAnagramsOut;
    }

    public static void main(String[] args) {

        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
