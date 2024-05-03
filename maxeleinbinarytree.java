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

    int findMax(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int max = node.data;
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);

        if (leftMax > max)
            max = leftMax;
        if (rightMax > max)
            max = rightMax;

        return max;
    }
}

public class maxeleinbinarytree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Maximum element in binary tree is " + tree.findMax(tree.root));
    }
}
