import java.util.*;
public class SortKSortedArray {
    public static void main(String[] args)
    {
        //the elements of ith location the array are displaced either at k times left or right 
        //sort the array.  
        int a[]={6,5,3,2,8,10,9};
        int k=3;

        Queue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i =0;i<a.length;i++)
        {
            pq.offer(a[i]);
            if(pq.size()>k)
            {
                al.add(pq.poll());
            }
        }
        while(!pq.isEmpty())
        {
            al.add(pq.poll());
        }

        System.out.println(al);
        
    }
    
}
