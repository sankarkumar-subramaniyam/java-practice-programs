/**
 * 
 */
package core;

/**
 * @author Sankar
 *
 */
public class Student {

	private String ss;
	private int int1;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + int1;
		result = prime * result + ((ss == null) ? 0 : ss.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (int1 != other.int1)
			return false;
		
		if (ss == null) {
			if (other.ss != null)
				return false;
		} else if (!ss.equals(other.ss))
			return false;
		
		return true;
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
