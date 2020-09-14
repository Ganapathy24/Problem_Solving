import java.util.*;
import java.lang.*;
import java.io.*;


class balancingBracket
 {
	public static void main(String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         String input_string = sc.next();
         Stack<Character> stk = new Stack<Character>();
         double m = 0,n = 0;
         for(int i = 0; i<input_string.length();i++){
             if(input_string.charAt(i) == '{'){
                 stk.push('{');
             }
             else{
                 if(!stk.isEmpty() && stk.peek() == '{'){
                     stk.pop();
                 }
                 else{
                     stk.push('}');
                 }
             }
         }
         for(Character ch : stk){
             if(ch == '{'){
                 m += 1;
             }
             else{
                 n += 1;
             }
         }
         if((m+n) % 2 != 0){
             System.out.println(-1);
         }
         else
         System.out.println((int)Math.ceil(m/2) + (int)Math.ceil(n/2));

	 }
     }
}