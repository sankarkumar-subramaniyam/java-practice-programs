package leetcode;

import java.util.HashMap;

public class MyAcceptedSolutions {

    // https://leetcode.com/problems/best-poker-hand/description/
    public static String bestHand(int[] ranks, char[] suits) {

        char flushChar = suits[0];
        for (int i = 1; i < suits.length; i++) {
            if (flushChar != suits[i]) break;
            if (i == suits.length - 1 && flushChar == suits[i]) return "Flush";
        }

        HashMap<Integer, Integer> kindMap = new HashMap<>();
        for (int i = 0; i < ranks.length; i++) {
            if (kindMap.containsKey(ranks[i]))
                kindMap.put(ranks[i], kindMap.get(ranks[i]) + 1);
            else
                kindMap.put(ranks[i], 1);
        }

        int maxKind = 0;
        for (int kindCount : kindMap.values()) {
            maxKind = Math.max(maxKind, kindCount);
        }

        if (maxKind >= 3)
            return "Three of a Kind";
        if (maxKind == 2)
            return "Pair";

        return "High Card";
    }


    public static void main(String[] args) {

        int[] ranks = new int[]{13, 2, 3, 1, 9};
        char[] suits = new char[]{'a', 'a', 'a', 'a', 'a'};
        System.out.println(bestHand(ranks, suits));

        ranks = new int[]{4, 4, 2, 4, 4};
        suits = new char[]{'d', 'a', 'a', 'b', 'c'};
        System.out.println(bestHand(ranks, suits));

        ranks = new int[]{10, 10, 2, 12, 9};
        suits = new char[]{'a', 'b', 'c', 'a', 'd'};
        System.out.println(bestHand(ranks, suits));

        String str = "ABC";


    }
}
