package Tree.BinaryTree.Build;

import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        this.right =  null;
        this.left = null;
    }
}
public class SimpleBuildDfs {
    static  Node root  = null;
    static Scanner sc  =  new Scanner(System.in);
    static void main() {
         root = Build();
         inOrder(root);
    }

    public static Node Build() {
        int val  = sc.nextInt();
        if (val == -1)
        {
            return  null;
        }
        Node newNode  =  new Node(val);
        newNode.left = Build();
        newNode.right = Build();

        return newNode;
    }
    public  static void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public  static void inOrder(Node root)
    {
        if(root!=null)
        {

            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    public  static void postOrder(Node root)
    {
        if(root!=null)
        {

            postOrder(root.left);
            System.out.println(root.data);
            postOrder(root.right);
        }
    }
}
