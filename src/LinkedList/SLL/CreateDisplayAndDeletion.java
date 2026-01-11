package LinkedList.SLL;

import java.util.Scanner;

public class CreateDisplayAndDeletion {



    // ===== Node class (from your CreateAndDisplay file) =====
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ===== insert (from CreateAndDisplay) =====
    static Node insert(Node head, Node newNode) {
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

    // ===== display (from CreateAndDisplay) =====
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ===== Insert at Begin (your code) =====
    static Node DeleteAtBegin(Node head) {
        Node temp = head;
        return temp.next;

    }

    // ===== Insert at End (your code) =====
    static void DeleteAtEnd(Node head) {
        if (head == null) return;

        Node temp = head;
        Node prev_temp = temp;
        while (temp.next != null) {
            prev_temp = temp;
            temp  = temp.next;
        }
        prev_temp.next = null;

    }

    // ===== Insert at Given Position (your code) =====
    static void deleteAtGivenPos(Node head, int p) {
        int i = 1;
        Node temp = head;
        Node prev_temp = temp;
        while (i < p) {
            prev_temp = temp;
            temp = temp.next;
            i++;
        }
        prev_temp.next = temp.next;
        temp = null;

    }

    // ===== main (your code arranged) =====
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size");
        int size = sc.nextInt();

        Node head = null;

        for (int i = 0; i < size; i++) {
            System.out.println("enter " + i + "th value");
            int data = sc.nextInt();
            Node n = new Node(data);
            head = insert(head, n);
        }

        System.out.println("before deleting");
        display(head);

//        System.out.println("after delete of begin");
//
//        head = DeleteAtBegin(head);
//        display(head);

//        System.out.println("after delete of end");
//
//        DeleteAtEnd(head);
//        display(head);

        System.out.println("enter pos");
        int p = sc.nextInt();

        if (p > size) {
            System.out.println("out of bound");
            return;
        }



        if (p == 0) {
    head = DeleteAtBegin(head);
        } else {
            deleteAtGivenPos(head, p);
        }

        display(head);
    }
}

