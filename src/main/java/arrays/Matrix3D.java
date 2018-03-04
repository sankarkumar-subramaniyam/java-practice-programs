/**
 * 
 */
package arrays;

/**
 * @author Sankar
 *
 */
public class Matrix3D {
	private static void printMatrix3D(int[][][] matrix3D) {
		for (int i = 0; i < matrix3D.length; i++) {
			for (int j = 0; j < matrix3D[i].length; j++) {
				for (int k = 0; k < matrix3D[i][j].length; k++)
					System.out.print(" " + matrix3D[i][j][k] + " | ");
				System.out.println();
			}
			System.out.println("---");
		}
		System.out.println("===");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][][] matrix3D = new int[2][2][2];
		int value = 0;
		for (int i = 0; i < matrix3D.length; i++)
			for (int j = 0; j < matrix3D[i].length; j++)
				for (int k = 0; k < matrix3D[i][j].length; k++)
					matrix3D[i][j][k] = value++;
		
		printMatrix3D(matrix3D);

	}

}
