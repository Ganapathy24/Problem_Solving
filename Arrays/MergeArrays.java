import java.util.*;

 class MergeArrays {
    public static void main(String[] args)
    {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt(),M = sc.nextInt();
            int mplusn[] = new int[N+M];
            int array[] = new int[N];
            for(int i=0;i<M+N;i++)
            {
                mplusn[i] = sc.nextInt();
            }
            for(int i=0;i<N;i++)
            {
                array[i] = sc.nextInt();
            }
            int index = M+N;
            for(int i = M+N-1;i>=0;i--)
            {
                if(mplusn[i] != -1)
                {
                    mplusn[--index] = mplusn[i];
                }
            }
            int j = index;
            int i=0;
            int k=0;
            while(i<N && j < M+N){
                if(array[i] > mplusn[j])
                {
                    mplusn[k++] = mplusn[j++];
                }
                else{
                    mplusn[k++] = array[i++];
                }
            }
            while(i<N) mplusn[k++] = array[i++];
            while(j<M+N) mplusn[k++] = mplusn[j++];
            for(int l:mplusn) System.out.print(l+" ");
        }
    }
}