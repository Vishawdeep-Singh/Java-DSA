package Linked_List;
import java.util.*;

public class Q2 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void printList( Node head) 
{ 
    Node temp = head; 
    while (temp != null) 
    { 
        System.out.printf("%d ", temp.data); 
        temp = temp.next; 
    } 
    System.out.printf("\n"); 
} 
    static Node push( Node head_ref, int new_data) 
{ 
    /* allocate node */
    Node new_node = new Node(new_data);
  
    /* put in the data */
    new_node.data = new_data; 
  
    /* link the old list off the new node */
    new_node.next = (head_ref); 
  
    /* move the head to point to the new node */
    (head_ref) = new_node;
      
    return head_ref;
} 
    public static void main(String[] args) {
        Node head = null; 
        int M=2, N=3; 
        head=push(head, 10); 
        head=push(head, 9); 
        head=push(head, 8); 
        head=push(head, 7); 
        head=push(head, 6); 
        head=push(head, 5); 
        head=push(head, 4); 
        head=push(head, 3); 
        head=push(head, 2); 
        head=push(head, 1); 
      
      
       
        System.out.printf("M = %d, N = %d \nGiven" + 
        "Linked list is :\n", M, N); 
printList(head); 

skipMdeleteN(head, M, N); 

System.out.printf("\nLinked list after deletion is :\n"); 
printList(head); 
    }

    static void skipMdeleteN(Node head , int M , int N){
        Node curr = head , t  ;
        
        int count;
         while (curr!=null) {
            for ( count = 1; count < M && curr!=null ; count++) {
                curr=curr.next;
                if (curr==null) {
                    return;
                }
            }
            t=curr.next;
            for (count = 1; count <= N && t!=null; count++) {
                Node temp = t;
                t=t.next;
            }
            curr.next=t;
            curr=t;
         }
         
    }
}
