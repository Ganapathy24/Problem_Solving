import java.util.*;
import java.lang.*;
import java.io.*;
class LargestRectangle
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         int N = sc.nextInt();
         ArrayList<Integer> list = new ArrayList<Integer>();
         for(int i = 0;i<N;i++)
         {
             list.add(sc.nextInt());
         }
         Stack<Integer> stk = new Stack<Integer>();
         int currArea,maxArea = -1;
         for (int i=0;i<N;i++)
         {
             if(stk.isEmpty() || list.get(stk.peek()) < list.get(i) ){
                 stk.push(i);
             }
             else{
                 while(!stk.isEmpty() && list.get(stk.peek()) > list.get(i)){
                     int k = stk.peek();
                     stk.pop();
                     currArea = list.get(k) * (stk.isEmpty() ? i : i - stk.peek() - 1);
                     maxArea = Math.max(maxArea,currArea);
                 }
                 stk.push(i);
             }
         }
         while(!stk.isEmpty()){
             int k = stk.peek();
             stk.pop();
             currArea = list.get(k) * (stk.isEmpty() ? N : N - stk.peek() - 1);
             maxArea = Math.max(maxArea,currArea);
         }
         System.out.println(maxArea);
	 }
     }
}