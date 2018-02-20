/**
 * 
 */
package algorithm.sort;

/**
 * @author Sankar
 *
 */
public class InsertionSort {
	int arr[] = { 2, 7, 5, 6, 8, 1 };
	
	private void sort() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
//				System.out.println("\n " + arr[j - 1] + "-" + arr[j]);
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

			/*System.out.println("UN-Sorted Array:  ");
			for (int v : arr) {
				System.out.print(v + " ");
			}*/
		}
	}
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort();

		System.out.println("\n\n Sorted Array:");
		for (int v : insertionSort.arr) {
			System.out.print(v + " ");
		}
	}
}
