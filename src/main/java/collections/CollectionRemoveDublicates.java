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
	public void setRemoveDublicates(Set<Integer> setA, Set<Integer> setB) {
		setA.removeAll(setB);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Integer> setA = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));
		HashSet<Integer> setB = IntStream.range(5, 15).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));

		setA.removeAll(setB);

		PrintAllCollections.print("setA := ", setA);
		PrintAllCollections.print("setB := ", setB);
	}

}
