public class SelectionSort {
    public static void main(String[] args) {
        int a[]={6,5,1,2,7,8,3,0};
        for(int i=0;i<a.length;i++)
        {
            int m=i;
            for(int j=i;j<a.length;j++)
            {
                if(a[m]>a[j])
                m=j;
            }
            if(m!=i)
            {
                int temp=a[i];
                a[i]=a[m];
                a[m]=temp;
            }
        }

        for(int i =0;i<a.length;i++)
        {
            System.out.println(" "+a[i]);
        }
    }
}
