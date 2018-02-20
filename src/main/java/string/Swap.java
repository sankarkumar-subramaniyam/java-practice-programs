/**
 * 
 */
package string;

/**
 * @author Sankar
 *
 */
public class Swap {

	private void swapByte(byte i, byte j) {
		System.out.println("\n Before : swapByte : i:= " + i + " ; j := " + j);
		i = (byte) (i + j);
		j = (byte) (i - j);
		i = (byte) (i - j);
		System.out.println("After : swapByte : i:= " + i + " ; j := " + j);
	}
	
	private void swapShort(short i, short j) {
		System.out.println("\n Before : swapShort : i:= " + i + " ; j := " + j);
		i = (short) (i + j);
		j = (short) (i - j);
		i = (short) (i - j);
		System.out.println("After : swapShort : i:= " + i + " ; j := " + j);
	}
	
	private void swapInt(int i, int j) {
		System.out.println("\n Before : swapInt : i:= " + i + " ; j := " + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("After : swapInt : i:= " + i + " ; j := " + j);
	}
	
	private void swapLong(long i, long j) {
		System.out.println("\n Before : swapLong : i:= " + i + " ; j := " + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("After : swapLong : i:= " + i + " ; j := " + j);
	}
	
	private void swapFloat(float i, float j) {
		System.out.println("\n Before : swapFloat : i:= " + i + " ; j := " + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("After : swapFloat : i:= " + i + " ; j := " + j);
	}
	
	private void swapDobule(double i, double j) {
		System.out.println("\n Before : swapDobule : i:= " + i + " ; j := " + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("After : swapDobule : i:= " + i + " ; j := " + j);
	}
	
	private void swapChar(char i, char j) {
		System.out.println("\n Before : swapChar : i:= " + i + " ; j := " + j);
		i = (char) (i + j);
		j = (char) (i - j);
		i = (char) (i - j);
		System.out.println("After : swapChar : i:= " + i + " ; j := " + j);
	}

	private void swapString(String s1, String s2) {
		System.out.println("\n Before : swapString : s1:= " + s1 + " ; s2 := " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After : swapString : s1:= " + s1 + " ; s2 := " + s2);
	}

	private void swapObject(Object obj1, Object obj2) {
		System.out.println("\n Before : swapObject : obj1:= " + obj1 + " ; obj2 := " + obj2);
		Object temp = obj1;
		obj1 = obj2;
		obj2 = temp;
		System.out.println("After : swapObject : obj1:= " + obj1 + " ; obj2 := " + obj2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Swap swap = new Swap();
		swap.swapByte((byte)2, (byte)8);
		swap.swapShort((short)2, (short)8);
		swap.swapInt(2, 8);
		swap.swapLong(2, 8);
		swap.swapFloat((float)2.0, (float)8.0);
		swap.swapDobule(2.0, 8.0);
		swap.swapChar('A', 'B');
		swap.swapString("Sankar", "Sangeetha");
		swap.swapObject(swap, new Swap());
	}

}
