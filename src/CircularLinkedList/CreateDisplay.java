package CircularLinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
public class CreateDisplay {
   static Node tail = null;
    static Node create(Node node,Node head)
    {
        if(tail == null)
        {
            tail = node;
            tail.next =  node;
        }else{
            node.next = tail.next;
            tail.next =  node;
            tail = node;
        }
        return tail.next;
    }
    static void display(Node head)
    {
        Node temp =  head;
        while(temp.next != tail.next)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(tail.data);
    }
    public static void main(String[] args) {
        Node head =  null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val  = sc.nextInt();
            Node node =  new Node(val,head);
            head = create(node,head);


        }
        display(head);
    }
}
