/**
 * 
 */
package math;

/**
 * @author Sankar
 *
 */
public class Factorial {

	/**
	 * 
	 * @param n
	 * @return
	 */
	private long findFactorial(int n) {
		long factorial = 1;

		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				factorial = factorial * i;
			}
		}

		return factorial;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	private long findFactorialRecursive(int n) {
		long factorial = 1;

		if (n > 1) {
			factorial = n * findFactorial(n - 1);
		}

		return factorial;
	}

	/**
	 * 
	 * Big negative numbers are values that overflowed into certain ranges;
	 * factorial(100) has more than 32 binary zeros on the end, so converting it to
	 * an integer produces zero.
	 * 
	 * 
	 * @param n
	 * @return
	 */
	// This function finds factorial of
	// large numbers and prints them
	private void factorial(int n) {
		int res[] = new int[500];

		// Initialize result
		res[0] = 1;
		int res_size = 1;

		// Apply simple factorial formula
		// n! = 1 * 2 * 3 * 4...*n
		for (int x = 2; x <= n; x++)
			res_size = multiply(x, res, res_size);

		System.out.println("Factorial of given number is ");
		for (int i = res_size - 1; i >= 0; i--)
			System.out.print(res[i]);
	}

	// This function multiplies x with the number
	// represented by res[]. res_size is size of res[] or
	// number of digits in the number represented by res[].
	// This function uses simple school mathematics for
	// multiplication. This function may value of res_size
	// and returns the new value of res_size
	private int multiply(int x, int res[], int res_size) {
		int carry = 0; // Initialize carry

		// One by one multiply n with individual
		// digits of res[]
		for (int i = 0; i < res_size; i++) {
			int prod = res[i] * x + carry;
			res[i] = prod % 10; // Store last digit of
								// 'prod' in res[]
			carry = prod / 10; // Put rest in carry
		}

		// Put carry in res and increase result size
		while (carry != 0) {
			res[res_size] = carry % 10;
			carry = carry / 10;
			res_size++;
		}
		return res_size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("0! := " + factorial.findFactorial(0));
		System.out.println("1! := " + factorial.findFactorial(1));
		System.out.println("2! := " + factorial.findFactorial(2));
		System.out.println("3! := " + factorial.findFactorial(3));
		System.out.println("4! := " + factorial.findFactorial(4));
		System.out.println("5! := " + factorial.findFactorial(5));
		System.out.println("6! := " + factorial.findFactorial(6));
		System.out.println("7! := " + factorial.findFactorial(7));
		System.out.println("8! := " + factorial.findFactorial(8));
		System.out.println("9! := " + factorial.findFactorial(9));
		System.out.println("10! := " + factorial.findFactorial(10));
		factorial.factorial(10);
		System.out.println("\n\n  20! := " + factorial.findFactorial(20));
		factorial.factorial(20);
		System.out.println("\n\n 30! := " + factorial.findFactorial(30));
		factorial.factorial(30);
		System.out.println("\n\n 100! := " + factorial.findFactorial(100));
		factorial.factorial(100);
		
		System.out.println("\n");
		System.out.println("0! := " + factorial.findFactorialRecursive(0));
		System.out.println("1! := " + factorial.findFactorialRecursive(1));
		System.out.println("2! := " + factorial.findFactorialRecursive(2));
		System.out.println("3! := " + factorial.findFactorialRecursive(3));
		System.out.println("4! := " + factorial.findFactorialRecursive(4));
		System.out.println("5! := " + factorial.findFactorialRecursive(5));

	}

}
