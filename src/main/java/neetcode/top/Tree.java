package neetcode.top;

import java.util.LinkedList;

public class Tree {

    public static <T> void printMyTreeBF(Node<T> node) {
        LinkedList<Node<T>> queue = new LinkedList<>();
        queue.offer(node);

        while (queue.size() > 0) {
            Node currentNode = queue.poll();
            System.out.println("--" + currentNode.value + "-----" + currentNode.levelSide);
            if (null != currentNode) {
                if (null != currentNode.left)
                    queue.offer(currentNode.left);
                if (null != currentNode.right)
                    queue.offer(currentNode.right);
            }
        }
    }

    public static <T> void printMyTreeDFPreOrder(Node node) {
        if (null != node) {
            System.out.println("--" + node.value + "-----" + node.levelSide);
            printMyTreeDFPreOrder(node.left);
            printMyTreeDFPreOrder(node.right);
        }
    }

    public static <T> void printMyTreeDFInOrder(Node node) {
        if (null != node) {
            printMyTreeDFInOrder(node.left);
            System.out.println("--" + node.value + "-----" + node.levelSide);
            printMyTreeDFInOrder(node.right);
        }
    }

    public static <T> void printMyTreeDFPostOrder(Node node) {
        if (null != node) {
            printMyTreeDFPostOrder(node.left);
            printMyTreeDFPostOrder(node.right);
            System.out.println("--" + node.value + "-----" + node.levelSide);

        }
    }

    public static Node invertTree(Node root) {
        // Do a BF navigation and swap left & right

        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (queue.size() > 0) {
            Node currNode = queue.poll();
            if (null != currNode) {
                Node temp = currNode.left;
                currNode.left = currNode.right;
                currNode.right = temp;

                if (null != currNode.left)
                    queue.offer(currNode.left);
                if (null != currNode.right)
                    queue.offer(currNode.right);
            }
        }

        return root;
    }

    public static int maxDepth(Node root) {
        if (null != root) {
            return depth(root);
        }
        return 0;
    }

    public static int depth(Node node) {
        if (null != node) {
            return Math.max(depth(node.left), depth(node.right)) + 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Node<String> root = new Node<>("A", "Top");

        Node<String> l1_left = new Node<>("B", "l1_left");
        Node<String> l1_right = new Node<>("C", "l1_right");

        Node<String> l2_1_left = new Node<>("D", "l2_1_left");
        Node<String> l2_2_right = new Node<>("E", "l2_2_right");
        Node<String> l2_3_left = new Node<>("F", "l2_3_left");
        Node<String> l2_4_right = new Node<>("G", "l2_4_right");

        Node<String> l3_1_1_left = new Node<>("H", "l3_1_1_left");
        Node<String> l3_2_1_right = new Node<>("I", "l3_2_1_right");
        Node<String> l3_3_2_left = new Node<>("J", "l3_3_2_left");
        Node<String> l3_4_2_right = new Node<>("K", "l3_4_2_right");
        Node<String> l3_5_3_left = new Node<>("L", "l3_5_3_left");
        Node<String> l3_6_3_right = new Node<>("M", "l3_6_3_right");
        Node<String> l3_7_4_left = new Node<>("N", "l3_7_4_left");
        Node<String> l3_8_4_right = new Node<>("O", "l3_8_4_right");

        l2_1_left.left = l3_1_1_left;
        l2_1_left.right = l3_2_1_right;
        l2_2_right.left = l3_3_2_left;
        l2_2_right.right = l3_4_2_right;
        l2_3_left.left = l3_5_3_left;
        l2_3_left.right = l3_6_3_right;
        l2_4_right.left = l3_7_4_left;
        l2_4_right.right = l3_8_4_right;
        l2_4_right.right = l3_8_4_right;

        l1_left.left = l2_1_left;
        l1_left.right = l2_2_right;
        l1_right.left = l2_3_left;
        l1_right.right = l2_4_right;

        root.left = l1_left;
        root.right = l1_right;

        printMyTreeBF(root);

        System.out.println("----------------------------- PreOrder ----------------------------------------");
        printMyTreeDFPreOrder(root);

        System.out.println("----------------------------- InOrder ----------------------------------------");
        printMyTreeDFInOrder(root);

        System.out.println("----------------------------- PostOrder ----------------------------------------");
        printMyTreeDFPostOrder(root);

        System.out.println("----------------------------- invertTree ----------------------------------------");
        printMyTreeBF(invertTree(root));

        System.out.println("----------------------------- maxDepth ----------------------------------------");
        System.out.println(maxDepth(root));
    }

    private static class Node<T> {

        T value;
        String levelSide;
        Node<T> left;
        Node<T> right;

        public Node(T value, String levelSide) {
            this.value = value;
            this.levelSide = levelSide;
        }

        public Node(T value, String levelSide, Node<T> left, Node<T> right) {
            this.value = value;
            this.levelSide = levelSide;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", levelSide='" + levelSide + '\'' +
                    '}';
        }
    }
}
