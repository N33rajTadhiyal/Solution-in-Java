class DuplicateZero{
    public static void main(String[] args) {
       
        int a[]={1,0,2,0,3};
        int z=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
                z++;
        }
         
         int i =a.length-1,j=a.length+z-1;
         
         while(i!=j)
         {
             insert(a,i,j);
             j--;
             if(a[i]==0)
             {
                 insert(a,i,j);
                 j--;
             }
             i--;
             
         }

     for(int k=0;k<a.length;k++)
     {
        System.out.print(a[k]+"  ");
     }

    }
    public static void insert(int a[],int i,int j)
    {
        if(j<a.length)
        {
            a[j]=a[i];
        }
    }
}