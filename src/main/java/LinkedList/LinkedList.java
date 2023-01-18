package LinkedList;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
//        Node<Integer> n1 = new Node(10);
//        Node<String> n2 = new Node("shiva");
//        Node<Double> n3 = new Node(19.3);
//
//        Node<String> head = n2;
//        n2.next = n1;
//        n1.next = n3;
//        n3.next = null;
        Node head = createIntLinkedList();
        traverse(head);


        insert(25,head,3);
        System.out.println("\n After Insert:  ");
        traverse(head);

        delete(head,3);
        System.out.println("\nAfter Delete Operation: ");
        traverse(head);

        boolean check = isPalindrome(head);
        if(check){
            System.out.println("\n IT IS A PALINDROME");
        } else {
            System.out.println("\n It is NOT a palindrome");
        }

        head = reverse(head);
        System.out.println("\nAfter reverse Operation: ");
        traverse(head);

    }

    public static Node createIntLinkedList() {
       Node head, cur;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the head node data: ");
        head = new Node(sc.nextInt());

        cur = head;
        int data = (int) head.data;
        while(data!=-1) {
            System.out.println("Enter the next node of "+data);
            data = sc.nextInt();
            if(data!=-1) {
                Node temp = new Node(data);
                cur.next = temp;
                cur = temp;
            }
        }


        return head;


    }

    public static void traverse(Node head) {
        Node cur = head;
        while(cur!=null) {
            System.out.print(cur.data);
            cur = cur.next;

            if(cur!=null)
                System.out.print(" --> ");
        }
    }

    public static void insert(int data,Node head,int pos) {
        if(pos ==0 ){
            Node node = new Node(data);
            node.next = head;
            head = node;
            return;
        }
        Node prev=head;
        for(int i=0;i<pos-1;i++) {
            prev = prev.next;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public static void delete(Node head,int pos) {
        if(pos==0) {
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public static Node reverse(Node head) {
        Node cur = head;
        Node prev=null;

        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head){
        if(head==null)
            return true;

        Node middle = middle(head);
        Node last = reverse(middle);
        Node cur = head;

        while(last!=null){
            if(cur.data!=last.data)
                return false;
            last=last.next;
            cur=cur.next;
        }
        return true;
    }

    public static Node middle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null)
            return slow.next;
        else
            return slow;
    }
}

class Node<T>{
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }
}
