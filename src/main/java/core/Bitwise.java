/**
 * 
 */
package core;

/**
 * @author Sankar
 *
 */
public class Bitwise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Byte Size := "+Byte.SIZE+" ; Bytes := "+Byte.BYTES);
		System.out.println("Short Size := "+Short.SIZE+" ; Bytes := "+Short.BYTES);
		System.out.println("Integer Size := "+Integer.SIZE+" ; Bytes := "+Integer.BYTES);
		System.out.println("Long Size := "+Long.SIZE+" ; Bytes := "+Long.BYTES);
		System.out.println("Float Size := "+Float.SIZE+" ; Bytes := "+Float.BYTES);
		System.out.println("Double Size := "+Double.SIZE+" ; Bytes := "+Double.BYTES);
		System.out.println("Character Size := "+Character.SIZE+" ; Bytes := "+Character.BYTES);
		System.out.println("\n\n");
		
		System.out.println("binary := "+Integer.toString(100,2)); // prints 1100100 --binary representation
		System.out.println("octal := "+Integer.toString(100,8)); // prints 144 --octal representation
		System.out.println("Hex := "+Integer.toString(100,16)); //prints 64 --Hex representation
		System.out.println("\n\n");
		
		System.out.println("------- 16 >> ---------"+Integer.toBinaryString(16));
		System.out.println((3>>1)+" ; Binary Value := "+Integer.toBinaryString(3>>1));// "01000 : "
		System.out.println((100<<1)+" ; Binary Value := "+Integer.toBinaryString(100>>1));// "01000 : "
		System.out.println((16>>0)+" ; Binary Value := "+Integer.toBinaryString(16>>0));// "10000 : "
		System.out.println((16>>1)+" ; Binary Value := "+Integer.toBinaryString(16>>1));// "01000 : "
		System.out.println((16>>2)+" ; Binary Value := "+Integer.toBinaryString(16>>2));// "00100 : "
		System.out.println((16>>3)+" ; Binary Value := "+Integer.toBinaryString(16>>3));// "00010 : "
		System.out.println((16>>4)+" ; Binary Value := "+Integer.toBinaryString(16>>4));// "00001 : "
		System.out.println((16>>5)+" ; Binary Value := "+Integer.toBinaryString(16>>5));// "00000 : "
		System.out.println("------- 15 >> ---------"+Integer.toBinaryString(15));
		System.out.println((15>>0)+" ; Binary Value := "+Integer.toBinaryString(15>>0));// "1111 : "
		System.out.println((15>>1)+" ; Binary Value := "+Integer.toBinaryString(15>>1));// "0111 : "
		System.out.println((15>>2)+" ; Binary Value := "+Integer.toBinaryString(15>>2));// "0011 : "
		System.out.println((15>>3)+" ; Binary Value := "+Integer.toBinaryString(15>>3));// "0001 : "
		System.out.println((15>>4)+" ; Binary Value := "+Integer.toBinaryString(15>>4));// "0000 : "
		System.out.println((15>>5)+" ; Binary Value := "+Integer.toBinaryString(15>>5));// "0000 : "
		System.out.println("------- 16 >>> ---------"+Integer.toBinaryString(16));
		System.out.println((16>>>0)+" ; Binary Value := "+Integer.toBinaryString(16>>>0));// "10000 : "
		System.out.println((16>>>1)+" ; Binary Value := "+Integer.toBinaryString(16>>>1));// "01000 : "
		System.out.println((16>>>2)+" ; Binary Value := "+Integer.toBinaryString(16>>>2));// "00100 : "
		System.out.println((16>>>3)+" ; Binary Value := "+Integer.toBinaryString(16>>>3));// "00010 : "
		System.out.println((16>>>4)+" ; Binary Value := "+Integer.toBinaryString(16>>>4));// "00001 : "
		System.out.println((16>>>5)+" ; Binary Value := "+Integer.toBinaryString(16>>>5));// "00000 : "
		System.out.println("------- -16 >>> ---------"+Integer.toBinaryString(-16));
		System.out.println((-16>>>0)+" ; Binary Value := "+Integer.toBinaryString(-16>>>0));// "11111111111111111111111111110000 : "
		System.out.println((-16>>>1)+" ; Binary Value := "+Integer.toBinaryString(-16>>>1));// "01111111111111111111111111111000 : "
		System.out.println((-16>>>2)+" ; Binary Value := "+Integer.toBinaryString(-16>>>2));// "00111111111111111111111111111100 : "
		System.out.println((-16>>>3)+" ; Binary Value := "+Integer.toBinaryString(-16>>>3));// "00011111111111111111111111111110 : "
		System.out.println((-16>>>4)+" ; Binary Value := "+Integer.toBinaryString(-16>>>4));// "00001111111111111111111111111111 : "
		System.out.println((-16>>>5)+" ; Binary Value := "+Integer.toBinaryString(-16>>>5));// "00000111111111111111111111111111 : "
		System.out.println("------- -1 >>> ---------"+Integer.toBinaryString(-1));
		System.out.println((-1>>>0)+" ; Binary Value := "+Integer.toBinaryString(-1>>>0));// "11111111111111111111111111111111 : "
		System.out.println((-1>>>1)+" ; Binary Value := "+Integer.toBinaryString(-1>>>1));// "01111111111111111111111111111111 : "
		System.out.println((-1>>>2)+" ; Binary Value := "+Integer.toBinaryString(-1>>>2));// "00111111111111111111111111111111 : "
		System.out.println((-1>>>3)+" ; Binary Value := "+Integer.toBinaryString(-1>>>3));// "00011111111111111111111111111111 : "
		System.out.println((-1>>>4)+" ; Binary Value := "+Integer.toBinaryString(-1>>>4));// "00001111111111111111111111111111 : "
		System.out.println((-1>>>5)+" ; Binary Value := "+Integer.toBinaryString(-1>>>5));// "00000111111111111111111111111111 : "
		System.out.println("------- 15 >>> ---------"+Integer.toBinaryString(15));
		System.out.println((15>>>0)+" ; Binary Value := "+Integer.toBinaryString(15>>>0));// "1111 : "
		System.out.println((15>>>1)+" ; Binary Value := "+Integer.toBinaryString(15>>>1));// "0111 : "
		System.out.println((15>>>2)+" ; Binary Value := "+Integer.toBinaryString(15>>>2));// "0011 : "
		System.out.println((15>>>3)+" ; Binary Value := "+Integer.toBinaryString(15>>>3));// "0001 : "
		System.out.println((15>>>4)+" ; Binary Value := "+Integer.toBinaryString(15>>>4));// "0000 : "
		System.out.println((15>>>5)+" ; Binary Value := "+Integer.toBinaryString(15>>>5));// "0000 : "
	}
}
