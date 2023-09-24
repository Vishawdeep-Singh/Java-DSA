package Linked_List;
import java.util.*;
public class Try {
   static Node prev=null;
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    public static boolean checkOdd(Node curr) {
        if(curr.data % 2 == 0){
            return false;
        }
        return true;
    }
    public static void util(Node head) {
        Node temp = head ;
       
        Node head1=null;
        
while(temp!=null){
        if(checkOdd(head)){
            Node t=temp;
            if(head1==null){
                head1=t;
            }
            else{
                t.next=head1;
                head1=t;

            }
            if(!checkOdd(temp.next)){
                prev.next=temp.next;
                temp=temp.next;

            }
        }
        prev=temp;
        temp=temp.next;
        
    }
    
}
public void addFirst(int data){
    //step 1 = create new node
    Node newNode = new Node(data);
    
   if (head==null) {
       head = newNode;
       return;
   }
  
   // step 2 newnode next = head
   newNode.next = head; //link
   //step 3 - head= newNode
   head=newNode;
}
public static void main(String[] args) {
    LinkedList ll =new LinkedList();
    ll.addFirst(6);
    ll.addFirst(1);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.addFirst(10);
    ll.addFirst(12);
    ll.addFirst(8);
    ll.print();
    util(head);
    ll.print();
    
}
public void print(){
    if (head==null) {
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while (temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
 }
}
