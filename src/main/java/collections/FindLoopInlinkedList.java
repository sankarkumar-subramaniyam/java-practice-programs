/**
 *
 */
package collections;

/**
 * @author Sankar
 *
 */
public class FindLoopInlinkedList {

	Node head;
	Node tail;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);


	}

	boolean isLoop() {
		if (null == tail.next)
			return false;
		return tail.next == head;
	}

	boolean add(Node node) {
		if (null == node)
			return false;

		if (null == head) {
			head = node;
			return true;
		}

		if (null != tail) {
			tail.next = node;
			tail = node;
		}

		// Loop and add last
		/*Node curr = head;
		while(curr != null){
			if(null == curr.next){
				curr.next = node;
				tail = curr.next;
				return true;
			}
			curr = curr.next;
		}*/

		return false;
	}

	static class Node {
		int val;

		Node next;

		Node(int val) {
			this.val = val;
		}
	}

}
