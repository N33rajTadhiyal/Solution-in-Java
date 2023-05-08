public class DublicateZero {
 public static void main(String[] args) {
      int a[]={1,2,3};
      Solution s= new Solution();
      s.duplicateZeros(a);
      
 }
}
class Solution {
    public void duplicateZeros(int[] a) {
        int b[]=new int[a.length];
        int k=0;
        for(int i =0;i<a.length && k<a.length;i++,k++)
        {
            if(a[i]==0)
            {
                b[k]=0;
                b[k+1]=0;
                k++;
            }
            else 
                b[k]=a[i];
        }
        for(int i=0;i<a.length;i++)
      {
        System.out.println(b[i]+"  ");
      }
    }
}