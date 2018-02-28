package collections;

import java.util.Comparator;
import java.util.TreeMap;

class Dog implements Comparable<Dog> {
	String color;
	int size;

	Dog(String c, int s) {
		color = c;
		size = s;
	}

	public String toString() {
		return color + " dog";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int compareTo(Dog o) {
		// return newo.size - this.size;
		System.out.println("\n ================= ");
		System.out.println("this Dog Color :=" + this.color + " - Size := " + this.size);
		System.out.println("New Dog Color :=" + o.color + " - Size := " + o.size);
		System.out.println("\n ================= " + (this.size - o.size));
		return this.size - o.size;
	}

}

public class TestTreeMap {
	public static void main(String[] args) {
		Dog d1 = new Dog("red", 30);
		Dog d2 = new Dog("black", 20);
		Dog d3 = new Dog("white", 10);
		Dog d4 = new Dog("white", 10);

		System.out.println("------------treeMap---------------");
		TreeMap<Dog, Integer> treeMap = new TreeMap<>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);

		treeMap.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});

		System.out.println("-------------treeMap2--------------");
		TreeMap<Dog, Integer> treeMap2 = new TreeMap<>(new Comparator<Dog>() {
			@Override
			public int compare(Dog o1, Dog o2) {
				int result = o1.getSize() - o2.getSize();
				if (result == 0) {
					result = o1.getColor().compareTo(o2.getColor());
				}
				return result;
			}
		});

		treeMap2.put(d1, 10);
		treeMap2.put(d2, 15);
		treeMap2.put(d3, 5);
		treeMap2.put(d4, 20);

		// print key values
		treeMap2.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});

		// print keys only
		treeMap2.keySet().forEach(k -> {
			System.out.println(k + " - ");
		});

		// print values only
		treeMap2.values().forEach(v -> {
			System.out.println(" - " + v);
		});

		// print entries
		treeMap2.entrySet().forEach(e -> {
			System.out.println(" - " + e.toString());
		});
	}
}
