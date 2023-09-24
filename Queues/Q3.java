package Queues;
import java.util.*;
public class Q3 {
    static class Job{
        char job_ID;
        int deadline;
        int profit;
    
        public  Job( char job_ID,int deadline,int profit) {
            this.deadline=deadline;
            this.profit=profit;
            this.job_ID=job_ID;
        }
    }

    public static void Jobschedule(ArrayList<Job> arr) {
        int n=arr.size();
        Collections.sort(arr,(a,b) -> {
            return a.deadline-b.deadline;
        }) ;
        ArrayList<Job>result=new ArrayList<>();
        PriorityQueue<Job> maxheap = new PriorityQueue<>((a,b) -> {return b.profit - a.profit;});

        for (int i = n-1; i > -1; i--) {
            int slot_available;

            if (i==0) {
                slot_available=arr.get(i).deadline;
            }
            else{
                slot_available=arr.get(i).deadline-arr.get(i-1).deadline;
            }
            maxheap.add(arr.get(i));
            while (slot_available>0 && maxheap.size()>0) {
                Job job = maxheap.remove();
                slot_available--;
                result.add(job);


            }
        }
        Collections.sort(result, (a,b) -> {
            return a.deadline-b.deadline;

        });
        for (Job job : result) {System.out.print(job.job_ID + " ");}
    }
    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));

        Jobschedule(arr);
    }
}
