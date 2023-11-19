/**
 * 
 */
package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
	
	public static void intersection(int[] num1,int[] num2) {

		HashSet<Integer> setA = Arrays.stream(num1).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));
		HashSet<Integer> setB = Arrays.stream(num2).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));

		HashSet<Integer> setAandB = new HashSet<Integer>();
		setAandB.addAll(setA);
		System.out.println(setAandB);
		setAandB.addAll(setB);
		System.out.println(setAandB);

		HashSet<Integer> setUnion = new HashSet<Integer>();
		setUnion.addAll(setA);

		// Only A
		setA.removeAll(setB);
		// Only B
		setB.removeAll(setUnion);

		// intersection : A and B
		setAandB.removeAll(setA);
		System.out.println(setAandB);
		setAandB.removeAll(setB);
		System.out.println(setAandB);

		// Union of A & B
		setUnion.addAll(setB);

		// Print
		System.out.println("--------- intersection -------------");
		PrintAllCollections.print("Only A := ", setA);
		PrintAllCollections.print("Only B := ", setB);
		PrintAllCollections.print("intersection : A and B := ", setAandB);
		PrintAllCollections.print("Union : (A U B) := ", setUnion);
		
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
		
		int[] num1 = {1,2,3,4,5} ;
		int[] num2 = {4,5,6,7,8,9};
		intersection(num1,num2);

	}

}
