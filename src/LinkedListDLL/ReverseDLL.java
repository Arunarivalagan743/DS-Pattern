package LinkedListDLL;

import java.util.Scanner;

import static LinkedListDLL.CreationDLL.*;

public class ReverseDLL {
    Node tail =  CreationDLL.tail;
    static  Node rev(Node head,Node tail)
    {
//        Node curr = head;
//        Node temp_next =head;
//        while(curr!=null)
//        {
//            temp_next= curr.next;
//            curr.next = curr.prev;
//            curr.prev = temp_next;
//            curr = temp_next;
//        }
        Node temp  = head;
        head = CreationDLL.tail;
        CreationDLL.tail = temp;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head =  null;
        System.out.println("Enter a  no of elemnts");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val  = sc.nextInt();
            Node data =  new Node(val,null,null);
            head =  create(data,head);

        }
        display(head);
        head = rev(head,CreationDLL.tail);
        display(head);
    }
}
