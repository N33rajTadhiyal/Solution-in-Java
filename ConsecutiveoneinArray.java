public class ConsecutiveoneinArray {
 public static void main(String[] args) {
    int a[]={1,1,0,1,1,1,0,0,0,1,1,0,0,1};
    System.out.println("THe max no of consequitice 1 in this array are:"+Maax(a));
 }
 public static int Maax(int a[])
 {
    int max=0,c=0;
    for(int i =0;i<a.length;i++)
    {
        if(a[i]==1)
        c++;
        else
        c=0;

        max=Math.max(max, c);
    }
    return max;
 }
}

