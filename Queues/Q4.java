package Queues;
import java.util.*;
public class Q4 {
    static void reverseQueue(int k , Queue<Integer> q){
        if (q.isEmpty()==true || k>q.size()) {
            return;
        }
        if (k<=0) {
            return;
        }
        Stack<Integer>s=new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < q.size()-k; i++) {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
       int k=5;
       reverseQueue(k, q);
       while (!q.isEmpty()) {
        System.out.println(q.remove());
       }
    }
}
