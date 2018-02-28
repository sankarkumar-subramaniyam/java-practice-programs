/**
 * 
 */
package algorithm;

/**
 * @author Sankar
 *
 */
public class Node<T> {

	T value;
	Node<T> leftNode;
	Node<T> rightNode;
	Node<T> parentNode;

	public Node(T value, Node<T> leftNode, Node<T> rightNode, Node<T> parentNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.parentNode = parentNode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leftNode == null) ? 0 : leftNode.hashCode());
		result = prime * result + ((parentNode == null) ? 0 : parentNode.hashCode());
		result = prime * result + ((rightNode == null) ? 0 : rightNode.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node<T> other = (Node) obj;
		if (leftNode == null) {
			if (other.leftNode != null)
				return false;
		} else if (!leftNode.equals(other.leftNode))
			return false;
		if (parentNode == null) {
			if (other.parentNode != null)
				return false;
		} else if (!parentNode.equals(other.parentNode))
			return false;
		if (rightNode == null) {
			if (other.rightNode != null)
				return false;
		} else if (!rightNode.equals(other.rightNode))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", leftNode=" + leftNode + ", rightNode=" + rightNode + ", parentNode="
				+ parentNode + "]";
	}

}
