import java.util.Scanner;

public class BinaryTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("IN ORDER ");
        inOrder(root);

        System.out.println("PRE ORDER ");
        preOrder(root);

        System.out.println("POST ORDER ");
        postOrder(root);

        System.out.println("Height==  "+height(root));
    }

    public static Node createTree() {
        Node root = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();

        if(data == -1)
            return null;
        root = new Node(data);

        System.out.println("Enter left for "+data);
        root.left = createTree();

        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }

    public static void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static int height(Node root) {
        if(root == null) return 0;

        return Math.max(height(root.left),height(root.right))+1;
    }

}

class Node {
    Node left,right;
    int data;
    Node(int data) {
        this.data = data;
    }
}
