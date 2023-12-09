/**
 * 
 */
package algorithm.tree;

/**
 * @author Sankar
 *
 */
public class BalancedTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(11);
        root.left.right = new TreeNode(12);

        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(22);

        root.right.left.left = new TreeNode(21);
        root.right.left.right = new TreeNode(22);

        BalancedTree balancedTree = new BalancedTree();

        System.out.println("isBalanced : " + balancedTree.isBalanced(root));
	}

    boolean isBalanced(TreeNode root) {
        if (null == root)
            return true;
        return getHeight(root.left) == getHeight(root.right);
    }

    int getHeight(TreeNode node) {
        if (null == node)
            return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    static class TreeNode {
        int val;

        TreeNode left;

        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}
