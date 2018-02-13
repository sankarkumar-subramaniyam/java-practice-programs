/**
 * 
 */
package algorithm.sort;

/**
 * @author Sankar
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 6, 8, 1 };
		
		for (int i = 0; i < arr.length; i++) {
			
			// Assume the current index is a samllest number
			int smallestIndex = i;
			
			// Find the index of the smallest number
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[smallestIndex]) {
					smallestIndex = j;
				}
			}
			
			// Swap samllest number to the current index
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
			
			System.out.println("\n UN-Sorted Array: smallestIndex "+smallestIndex);
			for (int v : arr) {
				System.out.print(v + " ");
			}
		}

		System.out.println("Sorted Array:");
		for (int v : arr) {
			System.out.print(v + " ");
		}
	}
}
