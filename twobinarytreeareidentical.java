class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root1, root2;

    boolean isIdentical(Node n1, Node n2) {
        if (n1 == null && n2 == null)
            return true;

        if (n1 != null && n2 != null) {
            return (n1.data == n2.data && isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right));
        }

        return false;
    }
}

public class twobinarytreeareidentical {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);

        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);

        if (tree.isIdentical(tree.root1, tree.root2))
            System.out.println("The two binary trees are identical");
        else
            System.out.println("The two binary trees are not identical");
    }
}
