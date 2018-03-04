/**
 * 
 */
package datastruct;

import java.util.LinkedList;

/**
 * @author Sankar
 *
 */
public class StackUsingQueue<T> {

	LinkedList<T> queue1 = new LinkedList<>();
	LinkedList<T> queue2 = new LinkedList<>();

	private boolean push(T value) {
		try {
			if (queue1.isEmpty() && queue2.isEmpty()) {
				queue1.offer(value);
			} else if (queue1.isEmpty() && !queue2.isEmpty()) {
				queue1.offer(value);
				while (!queue2.isEmpty()) {
					queue1.offer(queue2.poll());
				}
			} else {
				queue2.offer(value);
				while (!queue1.isEmpty()) {
					queue2.offer(queue1.poll());
				}
			}
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	private T peek() {
		if (!queue1.isEmpty()) {
			return queue1.peek();
		}else if (!queue2.isEmpty()) {
			return queue2.peek();
		}
		return null;
	}

	private T pop() {
		if (!queue1.isEmpty()) {
			return queue1.poll();
		}else if (!queue2.isEmpty()) {
			return queue2.poll();
		}
		
		return null;
	}

	private void printStack() {
		System.out.println("\n -----------------");
		LinkedList<T> queue = queue1.isEmpty() ? queue2 : queue1;
		for (int index = queue.size() - 1; index >= 0; index--) {
			System.out.print(" " + queue.get(index) + " | ");
		}
		System.out.println("\n -----------------");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StackUsingQueue<String> stack = new StackUsingQueue<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");

		stack.printStack();

		System.out.println("Peek := " + stack.peek());
		System.out.println("Pop := " + stack.pop());

		stack.printStack();
	}

}
