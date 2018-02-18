package collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 
 * @author Sankar
 *
 */
public class PrintAllMaps{
	
	public static void print(String string, Map map) {
		PrintAllCollections.print(string);
		PrintAllCollections.print(PrintAllCollections.NEXT_LINE_SEPARATETOR);
		map.entrySet().stream().forEach(System.out::println);
		PrintAllCollections.print(PrintAllCollections.NEXT_LINE_SEPARATETOR);
	}
	
	/**
	 *  parallelStream won't preserve the order.
	 * 
	 * @param string
	 * @param map
	 */
	public static void printParallel(String string, Map map) {
		PrintAllCollections.print(string);
		PrintAllCollections.print(PrintAllCollections.NEXT_LINE_SEPARATETOR);
		map.entrySet().parallelStream().forEach(System.out::println);
		PrintAllCollections.print(PrintAllCollections.NEXT_LINE_SEPARATETOR);
	}
	
	public static void printWithKV(String string, Map map) {
		PrintAllCollections.print(string);
		PrintAllCollections.print(PrintAllCollections.NEXT_LINE_SEPARATETOR);
		map.forEach((k,v) -> {System.out.println("Key := "+k+" ; Value :="+v);});
		PrintAllCollections.print(PrintAllCollections.NEXT_LINE_SEPARATETOR);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initialize
		Map<String,String> hashmap = new HashMap<>();
		Map<String,String> linkedhashmap = new LinkedHashMap<>();
		Map<String,String> treemap = new TreeMap<>();
		
		// Add values
		linkedhashmap.put("A", "Value-1");
		linkedhashmap.put("B", "Value-2");
		linkedhashmap.put("D", "Value-4");
		linkedhashmap.put("C", "Value-3");
		hashmap.putAll(linkedhashmap);
		treemap.putAll(linkedhashmap);
		
		// Let's print all 
		printParallel("HashMap",hashmap);
		print("LinkedHashMap",linkedhashmap);
		printWithKV("TreeMap",treemap);
		
	}
}
