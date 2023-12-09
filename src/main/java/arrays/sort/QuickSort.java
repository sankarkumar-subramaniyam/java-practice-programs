/**
 * 
 */
package arrays.sort;

/**
 * @author Sankar
 *
 */
public class QuickSort {

	int[] arr = { 2, 7, 5, 6, 8, 1 };

	private void quickSort(int lowerindex, int higherindex) {

		System.out.println("lowerindex-->" + lowerindex + " ; higherindex-->" + higherindex + " ; pivot-index-->"
				+ (lowerindex + (higherindex - lowerindex) / 2) + " ; pivot-->"
				+ arr[lowerindex + (higherindex - lowerindex) / 2]);
		System.out.println("###UN-Sorted Array:");
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println("\n---------------");

		//=================================================================
		int i = lowerindex;
		int j = higherindex;
		int pivot = arr[lowerindex + (higherindex - lowerindex) / 2];

		// i to j
		while (i <= j) {
			// all the values in left is smaller ?
			while (arr[i] < pivot) {
				i++;
			}
			// all the values in right is bigger ?
			while (arr[j] > pivot) {
				j--;
			}
			// Swap the bigger (from left) & samller (from right)
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		// Recursive sort left ...
		if (lowerindex < j)
			quickSort(lowerindex, j);
		
		// Recursive sort right ...
		if (i < higherindex)
			quickSort(i, higherindex);

	}
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(0, quickSort.arr.length - 1);

		System.out.println("Sorted Array:");
		for (int v : quickSort.arr) {
			System.out.print(v + " ");
		}
		System.out.println("\n====================================================================================");
	}
}
