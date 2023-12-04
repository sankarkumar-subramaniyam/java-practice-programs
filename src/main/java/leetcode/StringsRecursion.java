package leetcode;

import java.util.HashSet;

public class StringsRecursion {

    public static void main(String[] args) {
        StringsRecursion stringsRecursion = new StringsRecursion();


//        String out_1 = stringsRecursion.gcdOfStrings("ABCABC", "ABC");
//        System.out.println(out_1);
//
//        String out_2 = stringsRecursion.gcdOfStrings("ABABAB", "ABAB");
//        System.out.println(out_2);
//
//        String out_3 = stringsRecursion.gcdOfStrings("LEET", "CODE");
//        System.out.println(out_3);

//        System.out.println("for hello: " + stringsRecursion.reverseVowels("hello"));


        stringsRecursion.reverseWords("the sky is blue");
    }

    public String gcdOfStrings(String str1, String str2) {
        // Fail fast
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD for strings length
        int lengthOfGCD = gcd(str1.length(), str2.length());
        String strGCD = str1.substring(0, lengthOfGCD);
        return strGCD;
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, Math.abs(a - b));
    }

    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();

        while (left < right) {

            char lChar = Character.toLowerCase(chars[left]);
            char rChar = Character.toLowerCase(chars[right]);

            if (vowels.contains(lChar) && vowels.contains(rChar) && (lChar != rChar)) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                right--;
            }
            left++;
        }

        return new String(chars);
    }

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = (words.length - 1); i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0)
                sb.append(" ");
        }

        return sb.toString();
    }
}
