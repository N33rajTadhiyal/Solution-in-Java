import java.util.*;

public class kthLargestElement {
    public static void main(String[] args)
    {
        //find the kth Largest element in the given array
        int a[]={9,2,1,7,8,3,6,0};
        int k=3;
        
        Queue<Integer> pq =new PriorityQueue<>(k);

        for(int i =0;i<a.length;i++)
        {
            pq.offer(a[i]);
            if(pq.size()>k)
             pq.poll();
        }

        System.out.println(k+"th largest element in the array is :"+pq.peek());


    }
}
