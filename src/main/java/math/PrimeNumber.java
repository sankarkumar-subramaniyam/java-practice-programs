/**
 * 
 */
package math;

/**
 * @author Sankar
 *
 */
public class PrimeNumber {

	
	boolean isPrime(int n) {
		
		if(n == 0 || n == 1)
			return false;
		if(n == 2)
			return true;
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(3);
	}

}
