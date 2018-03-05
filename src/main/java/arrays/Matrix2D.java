/**
 * 
 */
package arrays;

/**
 * @author Sankar
 *
 */
public class Matrix2D {

	private static void printMatrix2D(int[][] matrix2D) {
		for (int i = 0; i < matrix2D.length; i++) {
			for (int j = 0; j < matrix2D[0].length; j++)
				System.out.print(" " + matrix2D[i][j] + " | ");
			System.out.println();
		}
		System.out.println();
	}

	private static boolean findInSortedMatrix2D(int[][] matrix2d, int findTarget) {
		if (matrix2d.length == 0 && matrix2d[0].length == 0)
			return false;

		int m = matrix2d.length;
		int n = matrix2d[0].length;

		int start = 0;
		int end = m * n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			int midX = mid / n;
			int midY = mid % n;
			
			System.out.println("Start := " + start + " ; End := " + end + " ; mid := " + mid + " ; midX := " + midX+ " ; midY:= " + midY);
			if (matrix2d[midX][midY] == findTarget)
				return true;

			if (matrix2d[midX][midY] < findTarget) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return false;

	}
	
	private static boolean findInUnSortedMatrix2DLinear(int[][] matrix2d, int findTartget) {
		
		for(int m =0;m <matrix2d.length;m++)
			for(int n =0;n <matrix2d[m].length;n++)
				if( matrix2d[m][n] == findTartget)
					return true;
		
		return false;
	}
	
	/**
	 * 
	 * Integers in each row are sorted in ascending from left to right. Integers in
	 * each column are sorted in ascending from top to bottom.
	 * 
	 * 
	 * @param matrix2d
	 * @param findTartget
	 * @return
	 */
	private static boolean findInSpacialSortedMatrix2D(int[][] matrix2d, int findTartget) {
		int m = matrix2d.length - 1;
		int n = matrix2d[0].length - 1;

		int i = m;
		int j = 0;

		while (i >= 0 && j <= n) {
			System.out.println("i := " + i + " ; j := " + j + " ; matrix2d[i][j] := " + matrix2d[i][j]);
			if (findTartget < matrix2d[i][j]) {
				i--;
			} else if (findTartget > matrix2d[i][j]) {
				j++;
			} else {
				return true;
			}
		}

		return false;
	}
	
	public static void rotate2DMatrixImage90D(int[][] matrix) {
		int length = matrix.length;

		// maxIndex
		int k = length - 1;

		for (int i = 0; i < length / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) length) / 2); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[k - j][i];
				matrix[k - j][i] = matrix[k - i][k - j];
				matrix[k - i][k - j] = matrix[j][k - i];
				matrix[j][k - i] = temp;
			}
		}

		System.out.println("------- rotate2DMatrixImage --------");
		printMatrix2D(matrix);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matrix2D = new int[10][10];
		int k = 0;
		for (int i = 0; i < matrix2D.length; i++)
			for (int j = 0; j < matrix2D[0].length; j++)
				matrix2D[i][j] = k++;

		System.out.println("---------------");
		int findTarget = 30;
		printMatrix2D(matrix2D);
		System.out.println(" findInSortedMatrix2D : Found 30 ? " + findInSortedMatrix2D(matrix2D, findTarget));

		System.out.println("---------------");
		int[][] matrix2DSorted = 	{ 
										{ 1, 3, 5, 7 }, 
										{ 10, 11, 16, 20 }, 
										{ 23, 30, 34, 444 } 
									};
		printMatrix2D(matrix2DSorted);
		System.out.println("findInSortedMatrix2D : Found 30 ? " + findInSortedMatrix2D(matrix2DSorted, findTarget));

		System.out.println("---------------");
		int[][] matrix2dUnSorted = 	{
										{1,   64,  7, 11, 15},
				  						{22,   57,  8, 12, 19},
				  						{3,   96,  9, 16, 22},
				  						{910, 138, 14, 17, 24},
				  						{108, 211, 23, 26, 30}
				  					};

		printMatrix2D(matrix2dUnSorted);
		System.out.println("findInUnSortedMatrix2DLinear : Found 30 ? " + findInUnSortedMatrix2DLinear(matrix2dUnSorted, findTarget));
		

		System.out.println("---------------");
		int[][] matrix2dSpacialSorted = {
											{1,   4,  7, 11, 15},
											{2,   5,  8, 12, 19},
											{3,   6,  9, 16, 22},
											{10, 13, 14, 17, 24},
											{18, 21, 23, 26, 30}
										};

		printMatrix2D(matrix2dSpacialSorted);
		System.out.println("findInSpacialSortedMatrix2D : Found 30 ? " + findInSpacialSortedMatrix2D(matrix2dSpacialSorted, findTarget+1));
		
		
		int[][] matrix2DMandN = new int[10][10];
		for (int i = 0; i < matrix2DMandN.length; i++)
			for (int j = 0; j < matrix2DMandN[0].length; j++)
				matrix2DMandN[i][j] = i;

		System.out.println("------- matrix2DMandN --------");
		printMatrix2D(matrix2DMandN);
		
		rotate2DMatrixImage90D(matrix2DMandN);
	}

}
