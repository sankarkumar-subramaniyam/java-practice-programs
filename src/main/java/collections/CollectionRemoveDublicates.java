/**
 * 
 */
package collections;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.HashSet;

/**
 * @author Sankar
 *
 */
public class CollectionRemoveDublicates {

	/**
	 * set a should have not elements of set b set b should not have elements of a
	 */
	public static void setRemoveDublicates(Set<Integer> setA, Set<Integer> setB) {
		setA.removeAll(setB);
		// Print
		System.out.println("--------- setRemoveDublicates -------------");
		PrintAllCollections.print("setA := ", setA);
		PrintAllCollections.print("setB := ", setB);
	}

	/**
	 * set a should have not elements of set b set b should not have elements of a
	 */
	public static void setRemoveDublicatesFromBoth(Set<Integer> setA, Set<Integer> setB) {
		// A = [1, 2, 3, 4 ] ; B = [ 2, 3, 5 ]
		Set<Integer> setTemp = new HashSet<>(setA);

		setA.removeAll(setB); // A = [1,4]
		setB.removeAll(setTemp); // B = [5]

		// Print
		System.out.println("--------- setRemoveDublicatesFromBoth -------------");
		PrintAllCollections.print("setA := ", setA);
		PrintAllCollections.print("setB := ", setB);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Integer> setA = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));
		HashSet<Integer> setB = IntStream.range(5, 15).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));
		HashSet<Integer> setC = IntStream.range(10, 20).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));
		HashSet<Integer> setD = IntStream.range(0, 15).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));

		setRemoveDublicates(setA,setB);
		setRemoveDublicatesFromBoth(setC,setD);

	}

}
