import java.util.*;

public class KNearest_Elements {
    public static void main(String[] args)
    {
        //given an array and k (amount or nearest element you need to return),x the element whose nearest
        //element we nee to return

        int a[]={8,2,3,4,7,9,5,6};
        int k=3;
        int x=7;

        Queue<Map.Entry<Integer,Integer>>pq= new PriorityQueue<>(k,(c,b)->Integer.compare(c.getKey(), b.getKey()));
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            m.put(Math.abs(a[i]-x),a[i]);
        }


        pq.addAll(m.entrySet());

        //returning top 3 elements as it it min heap so it will store value at top
        int c=0;
        while(c!=k)
        {
           System.out.println(pq.poll().getValue()+" ");
           c++;
        }
        
    }
}

