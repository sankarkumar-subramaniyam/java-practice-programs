package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collections.PrintAllCollections.print;

public class ArrayListImplementation {

	public static void main(String[] args) {

		// Type - 1 :
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);

		// Type - 2 :
		ArrayList<Integer> arrayList2 = (ArrayList<Integer>) arrayList.clone();
		arrayList2.add(3);
		arrayList2.add(4);

		// Type - 3 : better performance, it returns a List with an immutable size
		List<Integer> arrayList3 = Arrays.asList(new Integer[] { 5, 6, 7 });
		// for the operation runtime execption will be thrown : java.lang.UnsupportedOperationException
		// arrayList3.add(44);

		// Type - 4 :
		Integer[] integerArray = { 5, 6, 7 };
		ArrayList<Integer> arrayList4 = new ArrayList<Integer>(Arrays.asList(integerArray));
		arrayList4.addAll(arrayList3);

		print("Index 1",arrayList.get(1));
		print("size ",arrayList.size());
		print("isEmpty ",arrayList.isEmpty());
		print("contains ",arrayList.contains(3));
		print("containsAll ",arrayList.containsAll(arrayList3));
		print("toArray ",arrayList.toArray());
		print("toArray(a) ",arrayList.toArray(new Integer[5]));
		print("indexOf ",arrayList.indexOf(2));
//		print("Index 1",arrayList.trimToSize());
		print("remove ",arrayList.remove(1));
		print("retainAll ",arrayList.retainAll(arrayList2));
		print("removeAll ",arrayList2.removeAll(arrayList));
//		print("Index 1",arrayList.clear());
//		print("Index 1",arrayList.ensureCapacity(4));
		print("findFirst ",arrayList.stream().findFirst());

		print("Check ArrayList Impl : arrayList ", arrayList);
		print("Check ArrayList Impl : arrayList2 ", arrayList2);
		print("Check ArrayList Impl : arrayList3 ", arrayList3);
		print("Check ArrayList Impl : arrayList4 ", arrayList4);
	}

}
