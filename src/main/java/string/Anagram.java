/**
 * 
 */
package string;

import java.util.Arrays;

/**
 * An anagram of a string is another string that contains same characters, only the order of characters can be different.
 * 
 * @author Sankar
 *
 */
public class Anagram {

	private boolean isAnagram(String string1, String string2) {

		if (string1 == string2)
			return true;
		if (string1.equals(string2))
			return true;
		if (string1.length() != string2.length())
			return false;

		// if none of the above cases then,
		char[] string1Char = string1.toCharArray();
		char[] string2Char = string2.toCharArray();

		Arrays.sort(string1Char);
		Arrays.sort(string2Char);

		for(int i = 0; i < string2Char.length ; i++) {
			if(string1Char[i] != string2Char[i])
				return false;
		}

		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		System.out.println("AAA , BBB := isAnagram ? "+anagram.isAnagram("AAA", "BBB"));
		System.out.println("ABA , BAB := isAnagram ? "+anagram.isAnagram("ABA", "BAB"));
		System.out.println("ABB , BBA := isAnagram ? "+anagram.isAnagram("ABB", "BBA"));
		System.out.println("BAA , ABB := isAnagram ? "+anagram.isAnagram("BAA", "ABB"));
		System.out.println("LISTEN , SILENT := isAnagram ? "+anagram.isAnagram("LISTEN", "SILENT"));
		System.out.println("TRIANGLE , INTEGRAL := isAnagram ? "+anagram.isAnagram("TRIANGLE", "INTEGRAL"));
	}

}
