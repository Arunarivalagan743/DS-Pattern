package Tree.BinarySearchTree;



class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {

  public static Node insert(int val,Node root)
  {
      if(root== null)
      {
          Node newNode =  new Node(val);
          return newNode;
      }
      if(val < root.data)
      {
          root.left =  insert(val,root.left);
      } else if (val > root.data) {
          root.right =  insert(val,root.right);

      }
      return root;
  }


    public static void main(String[] args) {
        Node root = null;

        int[] values = {10,20,12,};

        for (int val : values) {
            root = insert(val,root);
        }



    }
}
