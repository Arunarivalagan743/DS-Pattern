package Tree.BinaryTree;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
}

public class BT {

    static Scanner sc = new Scanner(System.in);

    public static Node create() {
        int val = sc.nextInt();

        if (val == -1) {
            return null;
        }

        Node newNode = new Node();
        newNode.data = val;

        System.out.println("Enter left child of " + val);
        newNode.left = create();

        System.out.println("Enter right child of " + val);
        newNode.right = create();

        return newNode;
    }
    public static void display(Node root, String indent) {
        if (root == null) {
            return;
        }

        System.out.println(indent + root.data);

        display(root.left, indent + "\t");
        display(root.right, indent + "\t");
    }
    public static  void preorder(Node root)
    {
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static  void inorder(Node root)
    {
        if(root == null) {
            return;
        }

        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }
    public static  void postorder(Node root)
    {
        if(root == null) {
            return;
        }

        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }


    public static void main(String[] args) {
        System.out.println("Enter root value:");
        Node root = create();
//        display(root,"");
        preorder(root);
    }
}
