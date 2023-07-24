public class QuickSort {
    public static void main(String[] args)
    {
        int a[] = { 4, 1, 5, 6, 2 };
        int h = a.length - 1;
        Quick(a, 0, h);

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void Quick(int a[], int l, int h) {
        if(l>=h)
        return;
        
        int p = Part(a,l,h);
        Quick(a,l,p-1);
        Quick(a,p+1,h);

    }

    public static int Part(int a[], int l, int h) {
        int pivot = a[h];
        int i = l - 1;

        for (int j = l; j <= h - 1; j++) 
        {
            if (a[j] < pivot) 
            {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=a[h];
        a[h]=temp;

        return i;
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
