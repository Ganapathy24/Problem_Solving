import java.util.*;
class SortArray10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N= sc.nextInt();
            int arr[] = new int[N];
            int zeroindex = 0;
            for(int i=0;i<N;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<N;i++)
            {
                if(arr[i] == 0)
                {
                    int temp = arr[i];
                    arr[i] = arr[zeroindex];
                    arr[zeroindex++] = temp; 
                }
            }
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
