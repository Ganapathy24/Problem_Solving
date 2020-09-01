import java.util.*;

public class Sort012 {
    public static void sort012(int a[], int n){
        // code here
        int ind1 = 0, ind2 = n-1;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == 0) swap(a,i,ind1++);
        }
        for(int i = n-1;i>=0;i--)
        {
            if(a[i] == 2) swap(a,i,ind2--);
        }
    }
    public static void swap(int[] a,int t1,int t2)
    {
        int temp = a[t1];
        a[t1] = a[t2];
        a[t2] = temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i] = sc.nextInt();
            }
            sort012(arr, N);
            for(int i=0;i<N;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}