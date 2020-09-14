import java.util.*;
import java.lang.*;
import java.io.*;
class stockSpan
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(0);
        int span[] = new int[N];
        span[0] = 1;
        for(int i=1;i<N;i++)
        {
            while(!stk.isEmpty() && arr[stk.peek()] <= arr[i]){
                stk.pop();
            }
            span[i] = stk.isEmpty() ? i+1 : i - stk.peek();
            
            stk.push(i);
        }
        for(int i=0;i<N;i++) System.out.print(span[i] + " ");
        System.out.println("");
	 }
     }
}