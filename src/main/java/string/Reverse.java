/**
 * 
 */
package string;

/**
 * @author Sankar
 *
 */
public class Reverse {

	private String reverse(String string) {
		char[] stringChar = string.toCharArray();
		int i = 0;
		int j = stringChar.length - 1;

		while (i < j) {
			char temp = stringChar[i];
			stringChar[i] = stringChar[j];
			stringChar[j] = temp;
			i++;
			j--;
		}

		return new String(stringChar);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		System.out.println("AAABBB := reverse = " + reverse.reverse("AAABBB"));
		System.out.println("ABA := reverse = " + reverse.reverse("ABA"));
		System.out.println("ABBA := reverse = " + reverse.reverse("ABBA"));
		System.out.println("ABB := reverse = " + reverse.reverse("ABB"));
		System.out.println("RADAR := reverse = " + reverse.reverse("RADAR"));
		System.out.println("SANKAR := reverse = " + reverse.reverse("SANKAR"));
	}

}
