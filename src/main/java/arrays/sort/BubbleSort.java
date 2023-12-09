/**
 * 
 */
package arrays.sort;

/**
 * @author Sankar
 *
 */
public class BubbleSort {

	int[] arr = { 2, 7, 5, 6, 8, 1 };
	int length = arr.length;

	/**
	 * 
	 */
	private void sort() {
		
		for (int i = 0; i < (length - 1); i++) {
			for (int j = 0; j < (length - i - 1); j++) {
				// Swap
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				/*
				System.out.println("\nUN Sorted Array:");
				for (int v : arr) {
					System.out.print(v + " ");
				}*/
			}
		}
	}

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort();

		System.out.println("Sorted Array:");
		for (int v : bubbleSort.arr) {
			System.out.print(v + " ");
		}
	}
}
