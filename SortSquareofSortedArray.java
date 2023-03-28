public class SortSquareofSortedArray {
    public static void main(String args[])
    {
        int a[]={-7,-3,2,3,11};
        int b[]=new int[a.length];
        int l=0,h=a.length-1;
        int size = a.length-1;
        int i=0;
        for(int j =0;j<a.length;j++)
        {
           a[j]=a[j]*a[j];
        }

   
        while(l<=h)
        {
           if(a[l]>a[h])
           {
            b[size-i]=a[l];
            l++;
           }
           else 
           {
            b[size-i]=a[h];
            h--;
           }
        

           i++;
        }

        for(int j =0;j<a.length;j++)
        {
           System.out.print(" "+b[j]);
        }

    }
     }

