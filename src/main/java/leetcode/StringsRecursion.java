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


//        stringsRecursion.reverseWords("the sky is blue");

        System.out.println("for \"abc\",\"ahbgdc\" : " + stringsRecursion.isSubsequence("abc", "ahbgdc"));
        System.out.println("for \"axc\",\"ahbgdc\" : " + stringsRecursion.isSubsequence("abc", "ahbgdc"));
        System.out.println("for \"aaaaaa\",\"bbaaaa\" : " + stringsRecursion.isSubsequence("aaaaaa", "bbaaaa"));
    }

    public boolean isSubsequence(String s, String t) {
        Integer leftBound = s.length(), rightBound = t.length();
        Integer pLeft = 0, pRight = 0;

        while (pLeft < leftBound && pRight < rightBound) {
            // move both pointers or just the right pointer
            if (s.charAt(pLeft) == t.charAt(pRight)) {
                pLeft += 1;
            }
            pRight += 1;
        }
        return pLeft == leftBound;
    }

    public boolean isSubsequenceMineNotWorking(String s, String t) {
        // Check is the length same or higher
        // Check all the chars present of not
        // Check the position is greater than

        if (s.length() > t.length()) {
            return false;
        }

        int[] sCharsInT = new int[s.length()];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int sIndex = 0; sIndex < sChars.length; sIndex++) { // O(s)
            boolean isPresent = false;
            for (int tIndex = sIndex; tIndex < tChars.length; tIndex++) { // O(t)
                if (sChars[sIndex] == tChars[tIndex]) {
                    isPresent = true;
                    sCharsInT[sIndex] = tIndex;
                    if (sIndex > 0 && sCharsInT[sIndex - 1] > tIndex) {
                        return false;
                    }
                    break;
                }
            }
            if (!isPresent) {
                return false;
            }
        }
        return true;
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
