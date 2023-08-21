package app;

public class BinaryTree {
    TreeNode root;



    public BinaryTree() {

        root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(12);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(11);
    }


    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }
    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }
}
