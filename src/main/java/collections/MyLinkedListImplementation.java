/**
 * 
 */
package collections;

/**
 * @author Sankar
 *
 */
public class MyLinkedListImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyLinkedList<String> myList = new MyLinkedList<>();
		myList.add("Sankar");
		myList.add("Sangeetha");
		myList.add("AAA");
		myList.add("BBB");
		myList.add("CCC");
		myList.add("DDD");
		myList.add("EEE");
		myList.add("FFF");
		
		for(Object s : myList.toArray()) {
			System.out.println("**** ADD =  "+s);
		}
		
		myList.remove("DDD");
		
		for(Object s : myList.toArray()) {
			System.out.println("**** REMOVE =  "+s);
		}
		
		System.out.println("**** size =  "+myList.size());
		System.out.println("**** isEmpty =  "+myList.isEmpty());
		System.out.println("**** contains =  "+myList.contains("EEE"));
//		System.out.println("**** containsAll =  "+myList.containsAll(myList));
		
//		PrintAllCollections.print("MyLinkedList", myList);
		
	}

}
