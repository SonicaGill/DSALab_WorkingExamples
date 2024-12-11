class Node {
    int key;
    Node left, right;
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class Main {
    Node root;
    Main() {
        root = null;
    }
    Main(int key) {
        root = new Node(key);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        Main tree = new Main();  
        tree.root = new Node(1);
        Node a = new Node(2);
        tree.root.left = a;
        Node b = new Node(3);
        tree.root.right = b;
        a.left = new Node(4);
        a.right = new Node(5);

        System.out.println("Pre-Order");
        tree.printPreorder(tree.root);

        System.out.println("\nPost-Order");
        tree.printPostOrder(tree.root);

        System.out.println("\nIn-Order");
        tree.printInorder(tree.root);
    }
}
