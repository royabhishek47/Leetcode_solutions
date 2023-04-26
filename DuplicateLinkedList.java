package TutorOps;

import java.util.Scanner;

public class DuplicateLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void createNode(int d){
        int data = d;
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
        }
        else{
            Node n = head;
            while(n.next!=null)
                n = n.next;
            n.next = new_node;
        }
    }
    public void check_duplicacy(){
        Node no = head;
        while(no.next!=null){
            if(no.data==no.next.data){
                Node temp = no.next;
                no.next = temp.next;
                temp = null;
            }
            else{
                no = no.next;
            }
        } 
    }
    public void printList(){
        Node n = head;
        System.out.println("The final list is:");
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();
        DuplicateLinkedList ob = new DuplicateLinkedList();
        System.out.println("Enter the values:");
        for(int i = 0; i<n; i++){
            int data = sc.nextInt();
            ob.createNode(data);
        }
        ob.check_duplicacy();
        ob.printList();
        sc.close();
     }
}
