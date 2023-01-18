package DoublyLinkedList;

import java.util.Scanner;

public class DoubleLinkedList {
    private Node head,tail;
    private int length;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0; //head == null
    }

    public int length() {
        return length;
    }

    public void createDoubleLinkedList() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the head node data: ");
        head = new Node(sc.nextInt());
        head.prev = null;

        Node cur = head;
        int data = cur.data;

        while(data!=-1) {
            System.out.println("Enter the data next to "+data);
            data = sc.nextInt();
            if(data!=-1) {
                Node temp = new Node(data);

                cur.next = temp;
                temp.prev = cur;
                cur = temp;
                length++;
            }
        }

        tail=cur;

    }

    public  void traverse() {
        Node cur = head;
        while(cur!=null) {
            System.out.print(cur.data);
            cur = cur.next;

            if(cur!=null)
                System.out.print(" --> ");
        }
    }

    public void insert(int data,int pos) {
        Node newNode = new Node(data);

       if(isEmpty()){
           head=newNode;
           tail=head;
           length++;

       } else if(pos == 0){
           head.prev = newNode;
           newNode.next=head;
           head=newNode;
           length++;
       } else {
           Node cur=head;
           for(int i=0;i<pos-1;i++){
               cur = cur.next;
           }
           newNode.prev = cur;
           newNode.next = cur.next;
           cur.next=newNode;
           length++;
       }

       if(pos == length())
           tail = newNode;

    }

    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.createDoubleLinkedList();
        DLL.traverse();

        System.out.println("\nHead is:  "+DLL.head.data);
        System.out.println("\nTail is:  "+DLL.tail.data);

        System.out.println("\nEnter the new Data: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("Enter the position to be inserted: ");
        int pos = sc.nextInt();

        DLL.insert(data,pos);
        DLL.traverse();
        System.out.println("\nHead is:  "+DLL.head.data);
        System.out.println("\nTail is:  "+DLL.tail.data);
    }
}


 class Node {
     int data;
     Node next;
     Node prev;

    public Node(int data) {
        this.data = data;

    }
}
