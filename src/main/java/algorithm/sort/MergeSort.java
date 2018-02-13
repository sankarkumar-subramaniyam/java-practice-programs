/**
 * 
 */
package algorithm.sort;

/**
 * @author Sankar
 *
 */
public class MergeSort {
	int arr[] = { 2, 7, 5, 6, 8, 1 };
	int temp[] = new int[arr.length];

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;

			doMergeSort(lowerIndex, middleIndex);
			doMergeSort(middleIndex + 1, higherIndex);

			mergeParts(lowerIndex, middleIndex, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middleIndex, int higherIndex) {
		System.out.println("mergeParts :== " + lowerIndex + "-" + middleIndex + "-" + higherIndex);
		for (int i = lowerIndex; i <= higherIndex; i++) {
			temp[i] = arr[i];
			System.out.print(temp[i] + " ");
		}
		System.out.println();

		int i = lowerIndex;
		int j = middleIndex + 1;
		int k = lowerIndex;

		while (i <= middleIndex && j <= higherIndex) {
			if (temp[i] <= temp[j]) {
				arr[k] = temp[i];
				i++;
			} else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}

		while (i <= middleIndex) {
			arr[k] = temp[i];
			k++;
			i++;
		}

	}

	public static void main(String[] args) {

		MergeSort mergeSort = new MergeSort();
		/*
		 * System.out.println("Un-Sorted Array:"); for (int v : mergeSort.arr) {
		 * System.out.print(v + " "); } System.out.println();
		 */

		// mergeSort.doMergeSort("FullArray====",0,mergeSort.arr.length-1);
		mergeSort.doMergeSort(0, mergeSort.arr.length - 1);

		System.out.println("Sorted Array:");
		for (int v : mergeSort.arr) {
			System.out.print(v + " ");
		}

	}

	/*
	 * private void doMergeSort(String s, int lowerIndex, int higherIndex) {
	 * System.out.println("doMergeSort :== " + s + "-" + lowerIndex + "-" +
	 * higherIndex); if (lowerIndex < higherIndex) {
	 * 
	 * int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
	 * 
	 * System.out.println("doMergeSort :== " + s + "middleIndex-->" + middleIndex);
	 * doMergeSort(" :== " + "FirstHalf====", lowerIndex, middleIndex);
	 * 
	 * System.out.println(
	 * "------------------------------------------------------------");
	 * System.out.println("doMergeSort :== " + "###-" + s + "-" + lowerIndex + "-" +
	 * higherIndex); doMergeSort(" :== " + "SecondHalf====", middleIndex + 1,
	 * higherIndex);
	 * 
	 * mergeParts(lowerIndex, middleIndex, higherIndex);
	 * 
	 * } }
	 */
}
