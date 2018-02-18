/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sankar
 *
 */
public class PrintAllCollections {

	public static final String NEXT_LINE = "\n";
	public static final String NEXT_LINE_SEPARATETOR = "-------";
	public static final String ELEMENT_SEPARATETOR = " |, | ";

	/**
	 * 
	 * This method will print the given collection in below format
	 * 
	 * Ex : ------- HashSet -------
	 * ------------------------------------------------- 8 |, | 5 |, | 1 |, | 7 |, |
	 * 9 |, | 2 |, | 3 |, | -------------------------------------------------
	 * 
	 * @param collection
	 */
	public static void print(String string, Collection collection) {
		Consumer<Object> consumer = System.out::print;
		print(string);
		collection.parallelStream().forEach(o -> consumer.accept(NEXT_LINE_SEPARATETOR));
		consumer.accept(NEXT_LINE);

		collection.stream().forEach(o -> {
			consumer.accept(o);
			consumer.accept(ELEMENT_SEPARATETOR);
		});
		consumer.accept(NEXT_LINE);

		collection.parallelStream().forEach(o -> consumer.accept(NEXT_LINE_SEPARATETOR));
		consumer.accept(NEXT_LINE);
	}

	/**
	 * 
	 * @param string
	 */
	public static void print(Object object) {
		Consumer<Object> consumer = System.out::println;
		consumer.accept(String.format("%s%s %s %s", NEXT_LINE, NEXT_LINE_SEPARATETOR, object.toString(),
				NEXT_LINE_SEPARATETOR));
	}

	/**
	 * 
	 * @param string
	 */
	public static void print(String string, Object object) {
		Consumer<Object> consumer = System.out::println;
		consumer.accept(String.format("%s%s %s%s %s %s", NEXT_LINE, NEXT_LINE_SEPARATETOR, string, ELEMENT_SEPARATETOR,
				object.toString(), NEXT_LINE_SEPARATETOR));
	}

	/**
	 * 
	 * Object Array to String using Java 8 features 
	 * 
	 * @param string
	 */
	public static void print(String string, Object[] objectArr) {
		Consumer<Object> consumer = System.out::println;
		
		String objects = (null != objectArr && objectArr.length > 0) ? Stream.of(objectArr).map(o -> {
			return (null != o) ? o.toString() : "-NULL-";
		}).collect(Collectors.joining(ELEMENT_SEPARATETOR)) : "EMPTY_ARRAY";
		
		consumer.accept(String.format("%s%s %s%s %s", NEXT_LINE, NEXT_LINE_SEPARATETOR, string, objects,
				NEXT_LINE_SEPARATETOR));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> listStr = new ArrayList<>();
		List<Integer> linkedListStr = new LinkedList<>();
		Set<Integer> hashset = new HashSet<>();
		Set<Integer> treeset = new TreeSet<>();
		Set<Integer> linkedhashset = new LinkedHashSet<>();
		Queue<Integer> queue = new PriorityQueue<>();

		BiConsumer<String, Collection> printCollectionConsumer = PrintAllCollections::print;

		IntStream.range(0, 11).forEach(i -> listStr.add(ThreadLocalRandom.current().nextInt(10)));
		printCollectionConsumer.accept("ArrayList", listStr);

		linkedListStr.addAll(listStr);
		printCollectionConsumer.accept("LinkedList", linkedListStr);

		hashset.addAll(listStr);
		printCollectionConsumer.accept("HashSet", hashset);

		treeset.addAll(listStr);
		printCollectionConsumer.accept("TreeSet", treeset);

		linkedhashset.addAll(listStr);
		printCollectionConsumer.accept("LinkedHashSet", linkedhashset);

		queue.addAll(listStr);
		printCollectionConsumer.accept("PriorityQueue", queue);

	}

}
