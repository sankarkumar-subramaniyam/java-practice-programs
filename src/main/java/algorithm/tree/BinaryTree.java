/**
 *
 */
package algorithm.tree;

import algorithm.Node;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Sankar
 */
public class BinaryTree<T> {

    Node<T> root;

    /**
     * @param args
     */
    public static void main(String[] args) {

        Integer[] intArrayOrdered = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] intArrayUnOrdered = new Integer[]{4, 5, 6, 0, 1, 7, 8, 2, 3, 9};
        Integer[] intArrayReverseOrdered = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] intArrayRandomOrdered = new Integer[]{19, 18, 67, 46, 25, 74, 130, 200, 11, 0};

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createTree(intArrayOrdered);
        System.out.println("\n  ======== intArrayOrdered : BFS ==========");
        System.out.println("\n  ======== intArrayOrdered : Pre ==========");
        binaryTree.printTreePreOrder(binaryTree.root);
        System.out.println("\n  ======== intArrayOrdered : In ==========");
        binaryTree.printTreeInOrder(binaryTree.root);
        System.out.println("\n  ======== intArrayOrdered : Post ==========");
        binaryTree.printTreePostOrder(binaryTree.root);
        System.out.println("\n  Tree Height :- " + binaryTree.getHeight(binaryTree.root));

        binaryTree.root = null;
        binaryTree.createTree(intArrayUnOrdered);
        System.out.println("\n  ======== intArrayUnOrdered : In ==========");
        binaryTree.printTreeInOrder(binaryTree.root);
        System.out.println("\n  Tree Height :- " + binaryTree.getHeight(binaryTree.root));

        binaryTree.root = null;
        binaryTree.createTree(intArrayReverseOrdered);
        System.out.println("\n  ======== intArrayReverseOrdered : In ==========");
        binaryTree.printTreeInOrder(binaryTree.root);
        System.out.println("\n  Tree Height :- " + binaryTree.getHeight(binaryTree.root));

        binaryTree.root = null;
        binaryTree.createTree(intArrayRandomOrdered);
        System.out.println("\n  ======== intArrayRandomOrdered : In ========== : ");
        binaryTree.printTreeInOrder(binaryTree.root);
        System.out.println("\n  ======== intArrayRandomOrdered : BFS ==========");
        binaryTree.printTreeBF(binaryTree.root);
        System.out.println("\n  Tree Height :- " + binaryTree.getHeight(binaryTree.root));
        System.out.println("\n  Tree isBalanced :- " + binaryTree.isBalanced(binaryTree.root));


        Integer[] intArrayBalanced = new Integer[]{1,0,2};
        binaryTree.root = null;
        binaryTree.createTree(intArrayBalanced);
        System.out.println("\n  ======== intArrayBalanced : In ========== : ");
        binaryTree.printTreeInOrder(binaryTree.root);
        System.out.println("\n  ======== intArrayBalanced : BFS ==========");
        binaryTree.printTreeBF(binaryTree.root);
        System.out.println("\n  Tree isBalanced :- " + binaryTree.isBalanced(binaryTree.root));

    }

    private boolean isBalanced(Node<T> node) {

        if (null == node)
            return true;

        return getHeight(node.getLeftNode()) == getHeight(node.getRightNode());

    }

    private int getHeight(Node<T> node) {

        if (null == node)
            return -1;

        return Math.max(getHeight(node.getLeftNode()), getHeight(node.getRightNode())) + 1;

    }

    private void printTreeBF(Node<T> node) {
        if (null != node) {
            LinkedList<Node<T>> queue = new LinkedList<>();
            HashSet<Node> visited = new HashSet<>();

            queue.offer(node);
            while (!queue.isEmpty()) {
                Node<T> currentNode = queue.poll();
                if (!visited.contains(currentNode)) {
                    System.out.print(currentNode.getValue() + " , ");
                    visited.add(currentNode);
                }

                if (null != currentNode.getLeftNode()) {
                    queue.offer(currentNode.getLeftNode());
                }

                if (null != currentNode.getRightNode()) {
                    queue.offer(currentNode.getRightNode());
                }
            }
        }
    }

    private void printTreePreOrder(Node<T> node) {
        if (null != node) {
            System.out.print(node.getValue() + " , ");
            printTreePreOrder(node.getLeftNode());
            printTreePreOrder(node.getRightNode());
        }
    }

    private void printTreeInOrder(Node<T> node) {
        if (null != node) {
            printTreeInOrder(node.getLeftNode());
            System.out.print(node.getValue() + " , ");
            printTreeInOrder(node.getRightNode());
        }
    }

    private void printTreePostOrder(Node<T> node) {
        if (null != node) {
            printTreePostOrder(node.getLeftNode());
            printTreePostOrder(node.getRightNode());
            System.out.print(node.getValue() + " , ");
        }
    }

    private boolean createTree(T[] intArray) {
        boolean isTreeCreated = false;

        for (T value : intArray) {
            if (null == root) {
                root = new Node(value, null, null);
            } else {
                addNode(value, root);
            }
        }

        return isTreeCreated;
    }

    private void addNode(T value, Node<T> node) {
        if ((Integer) value < (Integer) node.getValue()) {
            if (null == node.getLeftNode()) {
                node.setLeftNode(new Node<T>(value, null, null));
            } else {
                addNode(value, node.getLeftNode());
            }
        } else if ((Integer) value > (Integer) node.getValue()) {
            if (null == node.getRightNode()) {
                node.setRightNode(new Node<T>(value, null, null));
            } else {
                addNode(value, node.getRightNode());
            }
        }
    }

}
