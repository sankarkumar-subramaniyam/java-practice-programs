/**
 * 
 */
package datastruct;

/**
 * @author Sankar
 *
 */
public class StackUsingArray<T> {

	int head = 0;
	int size = 0;
	T[] holder;

	public StackUsingArray(int capacity) {
		holder = (T[]) new Object[capacity];
		size = capacity;
	}

	private boolean push(T value) {
		if (head <= size) {
			holder[head] = value;
			head++;
			return true;
		}
		return false;
	}

	private T peek() {
		return holder[head-1];
	}

	private T pop() {
		T returnValue = holder[head-1];
		holder[head-1] = null;
		head--;
		return returnValue;
	}

	private void printStack() {
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
		StackUsingArray<String> stack = new StackUsingArray<>(5);
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
