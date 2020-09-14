import java.util.*;
import java.lang.*;
import java.io.*;
class nextGreater
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         int N = sc.nextInt();
         Stack<Integer> stk = new Stack<Integer>();
         ArrayList<Integer> list = new ArrayList<Integer>();
         for(int i=0;i<N;i++){
             list.add(sc.nextInt());
         }
         String result = " -1";
         stk.push(list.get(N-1));
         for(int i=N-2;i>=0;i--)
         {
             int k = list.get(i);
             while(stk.size() > 0 && k >= stk.peek()){
                 stk.pop();
             }
             if(stk.size() > 0){
                 result = " "+stk.peek()+result;
                 stk.push(k);
             }
             else{
                 result = " -1"+result;
                 stk.push(k);
             }
         }
         System.out.println(result.trim());
	 }
     }
}