public class  MurgeSorted {
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int b[]={2,5,6};
        int n =3;
        int m=3;
        int i=n-1;
        int j=m-1;

        int k=(m+n)-1;
       
        while(k>=0)
        {
            if(i>=0 && j>=0)
            {
              if(a[i]>=b[j])
              {
                 a[k--]=a[i--];
              }
              else{
                  a[k--]=b[j--];
              }
            }
            else if(j>=0)
            {
               a[k--]=b[j--];
            }
            else{
                break;
            }
        }

        for(int p=0;p<a.length;p++)
        {
            System.out.print(a[p]+"  ");
        }
    }
}
