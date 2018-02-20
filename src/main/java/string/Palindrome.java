package string;

public class Palindrome {

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

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println("AAA := isPalindrome ? " + palindrome.isPalindrome("AAA"));
		System.out.println("ABA := isPalindrome ? " + palindrome.isPalindrome("ABA"));
		System.out.println("ABBA := isPalindrome ? " + palindrome.isPalindrome("ABBA"));
		System.out.println("ABB := isPalindrome ? " + palindrome.isPalindrome("ABB"));
		System.out.println("RADAR := isPalindrome ? " + palindrome.isPalindrome("RADAR"));
		System.out.println("SANKAR := isPalindrome ? " + palindrome.isPalindrome("SANKAR"));
	}
}