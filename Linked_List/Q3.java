package Linked_List;
import java.util.*;

public class Q3 {
   static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
    }

    public void swapNodes(int x , int y){
        if (x==y) {
           return; 
        }
        Node prevX = null; Node currX=head;
        while (currX!=null && currX.data!=x) {
            prevX=currX;
            currX=currX.next;
        }
        Node prevY = null ; Node currY=head;
        while (currY!=null && currY.data!=y) {
            prevY=currY;
            currY=currY.next;
        }

        if (currX==null || currY==null) {
            return;
        }

        if (prevX!=null) {
            prevX.next=currY;
        } else {
            head=currY;
        }
        if (prevY!=null) {
            prevY.next=currX;
        } else{
            head=currX;
        }

        Node temp = currX.next;
        currX.next=currY.next;
        currY.next=temp;

    }
    public static void main(String[] args) {
        Q3 llist = new Q3();
 
        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
 
        System.out.print(
            "\n Linked list before calling swapNodes() ");
        llist.printList();
 
        llist.swapNodes(4, 3);
 
        System.out.print(
            "\n Linked list after calling swapNodes() ");
        llist.printList();

    }
    public void push(int new_data)
    {
        /* 1. alloc the Node and put the data */
        Node new_Node = new Node(new_data);
 
        /* 2. Make next of new Node as head */
        new_Node.next = head;
 
        /* 3. Move the head to point to new Node */
        head = new_Node;
    }
    public void printList()
    {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }
}
