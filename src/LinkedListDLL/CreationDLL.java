package LinkedListDLL;

import java.util.Scanner;



class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

}

public class CreationDLL {
    public static Node tail =  null;
    static  Node create(Node data,Node head)
    {

        if(head ==  null)
        {
            head = tail  =  data;
        }
        else{
            tail.next = data;
            data.prev= tail;
            tail = data;

        }
        return head;

    }
    static void display(Node head)
    {
    Node  temp  =  head;
     while(temp!=null)
     {
         System.out.println(temp.data);
         temp =  temp.next;
     }
    }
    static Node inserBeg(Node data,Node head)
    {

        if(head == null)
        {
            return head = data;
        }
        else{
            data.next =  head;
            head.prev = data;
            head = data;
        }
        return head;
    }
    static Node insertend(Node data,Node head)
    {
        if(head  == null)
        {
            head = tail = data;
            return head;
        }
      tail.next= data;

      data.prev = tail;
      tail= data;
      return head;

    }
    static Node insertpos(Node data,int k,Node head)
    {
      int i= 0;
      Node temp  =  head;
      Node prev =null;
      if(k == 0)
      {
          head = inserBeg(data,head);
          return head;
      }
      while(i < k - 1  && temp!=null)
      {
          prev = temp;
          temp =  temp.next;
          i++;
      }
      if(temp == null)
      {
          return insertend(data, head);
      }
        prev.next = data;
      data.prev= prev;

      data.next = temp;
      temp.prev = data;
return head;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter a  no of elemnts");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val  = sc.nextInt();
            Node data =  new Node(val,null,null);
            head =  create(data,head);

        }
        display(head);
//        System.out.println("entera begin value");
//        int val = sc.nextInt();

//        head = inserBeg(data,head);
//        display(head);
        System.out.println("entera end value");

        int val = sc.nextInt(); Node data = new Node(val,null,null);

        int k  = sc.nextInt();
     head = insertpos(data,k,head);
        display(head);

    }
}
