/**
 * 
 */
package collections;

import java.util.*;
import collections.Node;

/**
 * @author Sankar
 *
 */
public class LinkedListOperations<T> {

	/**
	 * Time complexity : O(n)
	 * Space complexity : O(1)
	 * 
	 * @param startNode
	 * @return
	 */
	public static Node<String> reverseList(Node<String> startNode){
		Node<String> prev = null;
		Node<String> curr = startNode;
	    while (curr != null) {
	    	Node<String> nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	}
	
	/**
	 * Time complexity : O(n)
	 * Space complexity : O(n)
	 * 
	 * @param startNode
	 * @return
	 */
	public static Node<String> reverseListUsingRecursive(Node<String> startNode) {
	    if (startNode == null || startNode.next == null) return startNode;
	    Node<String> prev = reverseList(startNode.next);
	    startNode.next.next = startNode;
	    startNode.next = null;
	    return prev;
	}
	
	public static void printLinkedList(Node<String> startNode) {
		Node<String> currentNode = startNode;
		int i = 0;
		while(null != currentNode) {
			System.out.println(i+"==="+currentNode.value);
			i++;
			currentNode = currentNode.next;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node<String> head = new Node<>("Head") ;
		Node<String> a = new Node<>("A") ;
		Node<String> b = new Node<>("B") ;
		Node<String> c = new Node<>("C") ;
		Node<String> tail = new Node<>("Tail") ;

		head.next = a;
		a.next = b;
		b.next = c;
		c.next = tail;
		// ------>
		printLinkedList(head);
		
		// <-------
		reverseList(head);
		printLinkedList(tail);
		
		// ------->
		reverseListUsingRecursive(tail);
		printLinkedList(head);
	}

}
