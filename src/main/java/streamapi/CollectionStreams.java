/**
 * 
 */
package streamapi;

import collections.PrintAllCollections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Sankar
 *
 */
public class CollectionStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<Integer> setA = IntStream.range(1, 51).boxed().collect(Collectors.toCollection(HashSet<Integer>::new));

//		LongStream
//		DoubleStream

        HashSet<Long> setL = LongStream.range(1, 100).boxed().collect(Collectors.toCollection(HashSet<Long>::new));

        TreeSet<Double> treeD = DoubleStream.generate(() -> (Math.random() * 100)).limit(10)
                .boxed().collect(Collectors.toCollection(TreeSet<Double>::new));

		PrintAllCollections.print(setA);

		System.out.println("\n ================= ");
		setA.stream().sorted(Comparator.comparingInt(o -> o)).map(o1 -> " " + o1 + ",").forEach(System.out::print);

		System.out.println("\n ================= ");
		setA.stream().filter(o1 -> o1 > 10 && o1 < 15).sorted(Comparator.comparingInt(o -> o)).map(o1 -> " " + o1 + ",").forEach(System.out::print);

		System.out.println("\n ================= ");
		setA.parallelStream().filter(o1 -> o1 > 20 && o1 < 35).sorted(Comparator.comparingInt(o -> o)).map(o1 -> " " + o1 + ",").forEach(System.out::print);

		System.out.println("\n ================= ");
		setA.stream().filter(o1 -> o1 > 10 && o1 < 15).sorted(Comparator.comparingInt(o -> o)).map(o1 -> " " + o1 + ",").forEach(System.out::print);


    }

}
