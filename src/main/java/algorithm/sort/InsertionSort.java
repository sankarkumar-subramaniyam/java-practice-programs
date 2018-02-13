/**
 * 
 */
package algorithm.sort;

/**
 * @author Sankar
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 6, 8, 1 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j > 0; j--) {
				System.out.println("\n " + arr[j - 1] + "-" + arr[j]);
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.println("UN-Sorted Array:  ");
			for (int v : arr) {
				System.out.print(v + " ");
			}
		}

		System.out.println("\n\n Sorted Array:");
		for (int v : arr) {
			System.out.print(v + " ");
		}
	}
}
