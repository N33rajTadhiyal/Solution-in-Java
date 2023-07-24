import java.util.*;
public class kthSmallestElement {
    public static void main(String[] args)
     {
        //find the kth smallest element in the given array
        int a[]={9,2,1,7,8,3,6,0};
        int k=4;

        Queue<Integer> pq=new PriorityQueue<>(3,Comparator.reverseOrder());
        
        for(int i =0;i<a.length;i++)
        {
            pq.offer(a[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
           
        }
        System.out.println("the "+k+"th smallest element in the array is :"+pq.peek());

    }
}
