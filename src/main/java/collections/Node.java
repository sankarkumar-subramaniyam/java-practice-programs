package collections;

import java.util.Objects;

public class Node<T> {
	T value;
	Node<T> prev;
	Node<T> next;

	public Node(T value) {
		this.value = value;
	}

	public Node(T value, Node<T> prev, Node<T> next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}

	@Override
	public int hashCode() {
		int result = 1;
		int primeNo = 31;
		result = primeNo * result + Objects.hash(value);
		return result;
	}

}
