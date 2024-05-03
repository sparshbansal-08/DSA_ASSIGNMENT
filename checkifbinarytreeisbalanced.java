class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    int treeHeight(Node node) {
        if (node == null)
            return 0;
        else {
            int leftHeight = treeHeight(node.left);
            int rightHeight = treeHeight(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    boolean isBalanced(Node node) {
        if (node == null)
            return true;

        int leftHeight = treeHeight(node.left);
        int rightHeight = treeHeight(node.right);

        // Check if the difference in heights of left and right subtrees is not more than 1
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right))
            return true;

        return false;
    }
}

public class checkifbinarytreeisbalanced {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        if (tree.isBalanced(tree.root))
            System.out.println("The tree is balanced");
        else
            System.out.println("The tree is not balanced");
    }
}
