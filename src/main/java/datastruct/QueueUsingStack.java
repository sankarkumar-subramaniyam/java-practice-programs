/**
 *
 */
package datastruct;

import java.util.Stack;

/**
 * @author Sankar
 *
 */
public class QueueUsingStack<T> {

    Stack<T> temp = new Stack<>();
    Stack<T> value = new Stack<>();

    /**
     * @param args
     */
    public static void main(String[] args) {

        QueueUsingStack<String> queue = new QueueUsingStack<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        queue.printQueue();

        System.out.println("Peek := " + queue.peek());
        System.out.println("Poll := " + queue.poll());
        System.out.println("Poll := " + queue.poll());
        System.out.println("Poll := " + queue.poll());
        System.out.println("Poll := " + queue.poll());
        System.out.println("Poll := " + queue.poll());

        queue.printQueue();
    }

    private boolean offer(T item) {

        try {
            while (!value.isEmpty()) {
                temp.push(value.pop());
            }

            value.push(item);

            while (!temp.isEmpty()) {
                value.push(temp.pop());
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private T peek() {
        return value.peek();
    }

    private void printQueue() {
        System.out.println("\n -----------------");
        for (int index = value.size() - 1; index >= 0; index--) {
            System.out.print(" " + value.elementAt(index) + " | ");
        }
        System.out.println("\n -----------------");
    }

    private T poll() {
        return value.empty() ? null : value.pop();
    }
}
