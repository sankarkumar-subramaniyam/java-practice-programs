package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
//		System.out.println("AAA := isPalindrome ? " + palindrome.isPalindrome("AAA"));
//		System.out.println("ABA := isPalindrome ? " + palindrome.isPalindrome("ABA"));
//		System.out.println("ABBA := isPalindrome ? " + palindrome.isPalindrome("ABBA"));
//		System.out.println("ABB := isPalindrome ? " + palindrome.isPalindrome("ABB"));
//		System.out.println("RADAR := isPalindrome ? " + palindrome.isPalindrome("RADAR"));
//		System.out.println("SANKAR := isPalindrome ? " + palindrome.isPalindrome("SANKAR"));


//		System.out.println("AAA := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("AAA"));
//		System.out.println("ABA := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("ABA"));
//		System.out.println("ABBA := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("ABBA"));
//		System.out.println("ABB := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("ABB"));
//		System.out.println("RADAR := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("RADAR"));
//		System.out.println("SANKAR := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("SANKAR"));

        ArrayList<String> al = new ArrayList<>();
        Collections.binarySearch(al, "A");
        Collections.reverseOrder();
        Collections.reverse(al);
        Collections.sort(al);
        Collections.min(al);
        Collections.max(al);

        int[] a = new int[5];
        Arrays.sort(a);
        int index = Arrays.binarySearch(a, 5);

        String[] sArr = new String[6];
        int index2 = Arrays.binarySearch(sArr, "F", Collections.reverseOrder());

        ArrayList<String> alStr = (ArrayList<String>) Arrays.asList(sArr);
//		Collectors.

        System.out.println("A man, a plan, a canal: Panama := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("A man, a plan, a canal: Panama"));
//		System.out.println("race a car := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars("race a car"));
//		System.out.println("\" \" := isPalindrome ? " + palindrome.isPalindromeWithSpecialChars(" "));

	}

	private boolean isPalindrome(String string) {
		char[] stringChar = string.toCharArray();

		int i = 0;
		int j = stringChar.length - 1;

		while (i < j) {
			if (stringChar[i] != stringChar[j])
				return false;
			i++;
			j--;
		}

        return true;
    }

    public boolean isPalindromeWithSpecialChars(String s) {
        char[] charsInS = s.toLowerCase().toCharArray();

        int left = 0;
        int right = charsInS.length - 1;

        while (left < right) {
            char leftChar = charsInS[left];
            char rightChar = charsInS[right];

            // Move to next char if it's not a valid chars'
            if (!(Character.isLetterOrDigit(leftChar))) {
                left++;
                continue;
            }

            if (!(Character.isLetterOrDigit(rightChar))) {
                right--;
                continue;
            }

            // Validate chars
            if ((Character.isLetterOrDigit(leftChar))
                    &&
                    (Character.isLetterOrDigit(rightChar))) {
                if (leftChar != rightChar)
                    return false;
            }
            // exit condition
            left++;
            right--;
        }
		return true;
	}
}