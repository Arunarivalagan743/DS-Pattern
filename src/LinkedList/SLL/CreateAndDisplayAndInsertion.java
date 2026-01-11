package LinkedList.SLL;
import java.util.Scanner;
public class CreateAndDisplayAndInsertion {



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
    static Node insertAtBegin(Node head, Node newNode) {
        newNode.next = head;
        return newNode;
    }

    // ===== Insert at End (your code) =====
    static void insertAtEnd(Node head, Node newNode) {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // ===== Insert at Given Position (your code) =====
    static void inserAtGivenPos(Node head, int p, Node newNode) {
        int i = 1;
        Node temp = head;
        while (i < p) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
       temp.next = newNode;
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

        System.out.println("before inserting");
        display(head);

        System.out.println("enter the value for begin");
        int bd = sc.nextInt();
        Node n = new Node(bd);
        head = insertAtBegin(head, n);
        display(head);

        System.out.println("enter the value for end");
        int id = sc.nextInt();
        Node e = new Node(id);
        insertAtEnd(head, e);
        display(head);

        System.out.println("enter pos");
        int p = sc.nextInt();

        if (p > size) {
            System.out.println("out of bound");
            return;
        }

        System.out.println("enter val");
        int v = sc.nextInt();
        Node vd = new Node(v);

        if (p == 0) {
            head = insertAtBegin(head, vd);
        } else {
            inserAtGivenPos(head, p, vd);
        }

        display(head);
    }
}

