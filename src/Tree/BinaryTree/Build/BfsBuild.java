package Tree.BinaryTree.Build;

import java.util.*;

public class BfsBuild {
    static Node root = null;
    static Scanner sc  = new Scanner(System.in);
    static  Node build()
    {
        int val   = sc.nextInt();
        if(val == -1)
        {
            return  null;
        }
        Queue <Node> q = new LinkedList<>();
        root =  new Node(val);
        q.add(root);

        while (!q.isEmpty())
        {
            Node  curr  =  q.poll();
            int left = sc.nextInt();
            if(left !=-1)
            {
                curr.left =  new Node(left);
                q.offer(curr.left);

            }
            int right = sc.nextInt();
            if(right!=-1)
            {
                curr.right =  new Node(right);
                q.offer(curr.right);

            }
        }
        return root;
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
    static List<List<Integer>> bfsTraversal(Node root)
    {
        List<List<Integer>> res  =  new ArrayList<>();
        Queue <Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty())
        {
            int size  =  q.size();
            List<Integer> inner  =  new ArrayList<>();
            for (int i  =0;i<size;i++)
            {
                Node curr  =  q.poll();
                inner.add(curr.data);
                if(curr.left !=null) q.offer(curr.left);
                if(curr.right !=null) q.offer(curr.right);
            }
            res.add(inner);
        }
        return res;

    }
    static void main() {
        root = build();
        preOrder(root);
        List<List<Integer>> res =  bfsTraversal(root);
        System.out.println(res);

    }
}
