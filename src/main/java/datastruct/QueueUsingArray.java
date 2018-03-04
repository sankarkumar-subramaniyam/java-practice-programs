/**
 * 
 */
package datastruct;

import java.util.LinkedList;

/**
 * @author Sankar
 *
 */
public class QueueUsingArray<T> {

	int head = 0;
	int tail = 0;
	int size = 0;
	T[] holder;

	public QueueUsingArray(int capacity) {
		holder = (T[]) new Object[capacity];
		size = capacity;
	}

	private boolean offer(T value) {
		if (tail != size) {
			holder[tail] = value;
			tail++;
			return true;
		}
		return false;
	}

	private T peek() {
		return holder[head];
	}

	private T poll() {
		T retrunValue = holder[head];
		holder[head] = null;
		return retrunValue;
	}

	private void printQueue() {
		System.out.println("\n -----------------");
		for (T value : holder) {
			System.out.print(" " + value + " | ");
		}
		System.out.println("\n -----------------");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueUsingArray<String> queue = new QueueUsingArray<>(5);
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");

		queue.printQueue();

		System.out.println("Peek := " + queue.peek());
		System.out.println("Poll := " + queue.poll());

		queue.printQueue();

	}

}
