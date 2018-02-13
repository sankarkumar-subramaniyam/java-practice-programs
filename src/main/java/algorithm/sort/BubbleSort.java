/**
 * 
 */
package algorithm.sort;

/**
 * @author Sankar
 *
 */
public class BubbleSort {
	public static void main(String args[]) {
		int arr[] = { 2, 7, 5, 6, 8, 1 };
		int length = arr.length;

		for (int i = 0; i < (length - 1); i++) {

			for (int j = 0; j < (length - i - 1); j++) {
				// Swap
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

				System.out.println("\nUN Sorted Array:");
				for (int v : arr) {
					System.out.print(v + " ");
				}
			}
		}

		System.out.println("Sorted Array:");
		for (int v : arr) {
			System.out.print(v + " ");
		}
	}
}
