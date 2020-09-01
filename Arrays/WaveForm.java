import java.util.*;
import java.lang.*;
import java.io.*;
class WaveForm
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         int N = sc.nextInt();
         ArrayList<Integer> list = new ArrayList<Integer>();
         for(int i=0;i<N;i++) list.add(sc.nextInt());
         for(int i=0;i<N;i+=2)
         {
             if(i>0 && list.get(i-1)>list.get(i))
             Collections.swap(list,i,i-1);
             
             if(i<N-1 && list.get(i+1)>list.get(i))
             Collections.swap(list,i,i+1);
         }
         for(int i:list) System.out.print(i+" ");
         System.out.println("");
     }
	 }
}