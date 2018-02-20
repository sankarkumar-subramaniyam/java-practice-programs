/**
 * 
 */
package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sankar
 *
 */
public class TraverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] intArray = IntStream.range(0, 11).boxed().toArray(Integer[]::new);
		String[] strArray = IntStream.range(0, 2).boxed().map(i -> "Int-" + i).toArray(String[]::new);

		// print all linear traverse
		Stream.of(intArray).forEach(System.out::println);
		Stream.of(strArray).forEach(System.out::println);

		traveseLeftAndRightAtSameTime(intArray);
		slidingWindow(intArray, 4);

		int[] a = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		System.out.println(Arrays.toString(maxSlidingWindow(a, k)));
	}

	private static void slidingWindow(Object[] objectArray, int windowsize) {

		for (int i = 0; i < (objectArray.length - windowsize + 1); i++) {
			System.out.print("\n [ ");
			for (int j = i; j < i + windowsize; j++) {
				System.out.print(objectArray[j] + ", ");
			}
			System.out.print(" ] \n");
		}

	}

	private static int[] maxSlidingWindow(int[] a, int k) {
		if (a == null || a.length == 0)
			return new int[] {};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		int[] result = new int[a.length - k + 1];
		int count = 0;
		for (int i = 0; i < a.length - k + 1; i++) {
			for (int j = i; j < i + k; j++) {
				pq.offer(a[j]);
			}
			result[count] = pq.poll();
			count = count + 1;
			pq.clear();
		}
		return result;

	}

	private static void traveseLeftAndRightAtSameTime(Object[] objectArray) {
		int i = 0;
		int j = objectArray.length - 1;
		while (i <= j) {
			System.out.println("for i := " + objectArray[i]);

			if (i != j)
				System.out.println("# for j := " + objectArray[j]);

			i++;
			j--;
		}
	}

}
