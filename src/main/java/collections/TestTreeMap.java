package collections;

import java.util.TreeMap;

class Dog implements Comparable {
	String color;
	int size;

	Dog(String c, int s) {
		color = c;
		size = s;
	}

	public String toString() {
		return color + " dog";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Dog) {
			Dog newo = (Dog) o;
//			return newo.size - this.size;
			System.out.println("\n ================= ");
			System.out.println("this Dog Color :=" +this.color+ " - Size := " + this.size);
			System.out.println("New Dog Color :=" +newo.color+ " - Size := " + newo.size);
			System.out.println("\n ================= "+( this.size - newo.size));
			return this.size - newo.size;
		}
		return 0;
	}

}

public class TestTreeMap {
	public static void main(String[] args) {
		Dog d1 = new Dog("red", 30);
		Dog d2 = new Dog("black", 20);
		Dog d3 = new Dog("white", 10);
//		Dog d4 = new Dog("white", 10);
		
		TreeMap<Dog,Integer> treeMap = new TreeMap<>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
//		treeMap.put(d4, 20);
		
		treeMap.forEach((k,v) -> {System.out.println(k + " - " + v);});
		
	}
}
