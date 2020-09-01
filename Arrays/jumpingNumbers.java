import java.util.*;
import java.lang.*;
import java.io.*;
class jumpingNumbers
 {
     Queue<Integer> que = new LinkedList<Integer>();
	public static void main (String[] args)
     {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         int N = sc.nextInt();
         jumpingNumbers obj = new jumpingNumbers();
         
         for(int i=1;i<N && i<=9 ;i++)
         {
             obj.que.add(i);
         }
         System.out.print(0+" ");
         obj.bfs(N,10,obj.que);
         System.out.println("");
     }
     }
     public void bfs(int N,int X,Queue<Integer> que)
     {
        while(!que.isEmpty())
        {
            int k = que.poll();
            if(k > N ) return ;
            System.out.print(k+" ");
            int rem = k%10;
            if(rem == 0){
                que.add(k*10+(rem+1));
            }
            else if(rem == 9)
            {
                que.add(k*10 + (rem -1));
            }
            else{
                que.add(k*10 + (rem-1));
                que.add(k*10 + (rem +1));
            }
            
        }
     }
}