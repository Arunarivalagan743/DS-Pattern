package Tree.BinaryTree.BFS;

import Tree.Simple.BT;

import java.util.*;

import static Tree.Simple.BT.preorder;


public class Bfs {
static Queue <Integer> q = new LinkedList<>();


   static  Scanner sc =  new Scanner(System.in);
    static class Node {
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static  Node create()
    {

        int val  = sc.nextInt();
        if(val ==  -1)
        {
            return null;
        }
        Node newNode =  new Node(val);

        System.out.println("Enter left");
        newNode.left =  create();
        System.out.println("Enter right");
        newNode.right =  create();

        return  newNode;
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
    public static List<List<Integer>> BFS(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null)
            return res;

        q.offer(root);

        while(!q.isEmpty())
        {
            int size =  q.size();
            List<Integer> inner = new ArrayList<>(size);
            for(int i  =0;i<size;i++)
            {
                Node cur =  q.poll();
                inner.add(cur.data);
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);

            }
            res.add(inner);



        }
        return res;

    }


    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter a root");
        Node root =  null;
        root = create();
//        preorder(root);
       List <List<Integer>> res  = BFS(root);
        System.out.println(res);
    }
}
