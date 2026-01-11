package LinkedList.SLL;

import java.util.Scanner;

public class ReverseSLL_LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data =  data;
            this.next =  null;
        }
    }
    static Node insert(Node head,Node newNode)
    {
        if (head == null) {
            head = newNode;
            return head;
        }
       Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static void display(Node head) {
      Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node reverse(Node head)
    {
        Node current  =  head;
        Node nextNode = head;
        Node prev=  null;
        while(nextNode != null)
        {
            nextNode = nextNode.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return head = prev;
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter a size");
        int size =  sc.nextInt();
        for(int i =0;i<size;i++)
        {
            System.out.println("Enter a "+i+"th value");
            int d =  sc.nextInt();
            Node val = new Node(d);
            head = insert(head,val);
        }
        System.out.println("Before reverse");
        display(head);
       head =  reverse(head);
        System.out.println("After reverse");
        display(head);
    }

}
