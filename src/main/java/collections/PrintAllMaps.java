package collections;

import java.util.Map;
import java.util.function.Consumer;
import java.util.HashMap;

/**
 * 
 * @author Sankar
 *
 */
public class PrintAllMaps{
	
	public static void print(String string, Map map) {
		Consumer<String> printStrConsumer = PrintAllCollections::printString;
		printStrConsumer.accept(string);
		printStrConsumer.accept(PrintAllCollections.NEXT_LINE_SEPARATETOR);
		map.entrySet().parallelStream().forEach(System.out::println);
		printStrConsumer.accept(PrintAllCollections.NEXT_LINE_SEPARATETOR);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,String> hashmap = new HashMap<>();
		
		hashmap.put("Key-1", "Value-1");
		
		print("HashMap",hashmap);
	}
}
