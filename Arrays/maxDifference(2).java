import java.util.*;


public class maxDifference {
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
            int lMin[] = new int[N];
            lMin[0] = arr[0];
            int rMax[] = new int[N];
            rMax[N-1] = arr[N-1];
            for(int i=1;i<N;i++)
            {
                lMin[i] = Math.min(lMin[i-1],arr[i]);
            }
            for(int i=N-2;i>=0;i--)
            {
                rMax[i] = Math.max(rMax[i+1],arr[i]);
            }
            int i=0,j=0,maxDiff = -1;
            while(i<N && j<N)
            {
                if(lMin[i] < rMax[j])
                {
                    maxDiff = Math.max(maxDiff,j-i);
                    j+=1;
                }
                else{
                    i+=1;
                }
            }
            System.out.print(maxDiff);
            
        }
    }
}