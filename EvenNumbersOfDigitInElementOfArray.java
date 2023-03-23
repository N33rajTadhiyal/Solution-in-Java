public class EvenNumbersOfDigitInElementOfArray {
    public static void main(String[] args) {
        int a[]={1,2,1234,12,123,12345,1233,12};
        System.out.println("the total no of element who have even no of digits on them are :"+Ret(a));
        
    }
  
    public static int Ret(int a[])
    {
        int c=0;
        for(int i =0;i<a.length;i++)
        {
           if(Check(a[i]))
           {
            c++;
           }
        }


        return c;
    }
 public static boolean Check(int n)
 {
    int c=0;
    while(n!=0)
    {
        n=n/10;
        c++;
    }

    if(c%2==0)
    {
        return true;
    }

    return false;
 }
}
