/**
 * 
 */
package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/**
 * @author Sankar
 *
 */
public class MyLinkedList<E> implements List<E> {

	Node<E> first;
	Node<E> last;
	
	int size = 0;
	
	class Node<E> {
		E element;

		Node<E> previous;
		Node<E> next;
		
		Node(Node<E> previous,E element,Node<E> next){
			this.previous = previous;
			this.element = element;
			this.next = next;
		}
	}
	
	@Override
	public boolean add(E e) {
		Node<E> l = last;
		Node<E> node = new Node<E>(l,e,null);
		last = node;
		if(l==null) {
			first = node;
		} else {
			l.next = node;
		}
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		for(Node<E> node = first; node != null; node = node.next ) {
		    if(node == o || (Objects.nonNull(node.element) && node.element.equals(o)) ) {
		    	node.previous.next = node.next;
		    	if(null != node.next)
		    		node.next.previous = node.previous;
		    	size--;
		    } 
		}
		return true;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public boolean contains(Object o) {
		for(Node<E> node = first; node != null; node = node.next ) {
		    if(node == o || (Objects.nonNull(node.element) && node.element.equals(o)) ) {
		    	return true;
		    } 
		}
		
		return false;
	}
	
	@Override
	public boolean containsAll(Collection<?> c) {
		for(Object o : c) {
			if(!contains(o))
				return false;
		}
		return true;
	}

	@Override
	public Object[] toArray() {
		Object[] oArr = new Object[size];
		int i =0;
		for(Node<E> node = first; node != null;node = node.next) {
			oArr[i++] = node.element;
		}
		return oArr;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
