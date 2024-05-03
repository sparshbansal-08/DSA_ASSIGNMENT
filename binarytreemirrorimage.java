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

    Node mirror(Node node) {
        if (node == null)
            return node;

        Node left = mirror(node.left);
        Node right = mirror(node.right);


        node.left = right;
        node.right = left;

        return node;
    }

    void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
}

public class binarytreemirrorimage {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of original binary tree: ");
        tree.inorderTraversal(tree.root);

        tree.mirror(tree.root);

        System.out.println("\nInorder traversal of mirror binary tree: ");
        tree.inorderTraversal(tree.root);
    }
}
