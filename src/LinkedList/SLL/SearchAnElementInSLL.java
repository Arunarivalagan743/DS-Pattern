package LinkedList.SLL;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    Node insert(Node head, Node newNode) {

        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
     void display(Node head) {

        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " => ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}


public class SearchAnElementInSLL {

    static Node insert(Node head, Node newNode) {

        if (head == null) {
            return newNode;
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
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " => ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // ✅ FIXED: static + temp declared
    static void search(Node head, int k) {

        Node temp = head;

        while (temp != null && temp.data != k) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        Node head = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insert(head, new Node(val));
        }

        display(head);

        System.out.println("Enter search value:");
        int k = sc.nextInt();

        search(head, k);
    }
}
