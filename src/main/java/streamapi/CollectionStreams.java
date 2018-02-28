/**
 * 
 */
package streamapi;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import collections.PrintAllCollections;

/**
 * @author Sankar
 *
 */
public class CollectionStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<Integer> setA = IntStream.range(0, 50).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));

		PrintAllCollections.print(setA);

		System.out.println("\n ================= ");
		setA.stream().sorted((o1,o2)-> {return  o1-o2;}).map(o1 -> " "+o1+",").forEach(System.out::print);

		System.out.println("\n ================= ");
		setA.stream().filter(o1 -> o1 > 10 && o1 < 15).sorted((o1,o2)-> {return  o1-o2;}).map(o1 -> " "+o1+",").forEach(System.out::print);
		
		System.out.println("\n ================= ");
		setA.parallelStream().filter(o1 -> o1 > 20 && o1 < 35).sorted((o1,o2)-> {return  o1-o2;}).map(o1 -> " "+o1+",").forEach(System.out::print);
		
		System.out.println("\n ================= ");
		setA.stream().filter(o1 -> o1 > 10 && o1 < 15).sorted((o1,o2)-> {return  o1-o2;}).map(o1 -> " "+o1+",").forEach(System.out::print);
		
	}

}
