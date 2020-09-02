import java.util.*;
import java.lang.*;
import java.io.*;

class LockAndKey
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         int N = sc.nextInt();
         char arr[] = {'!', '#', '$', '%', '&', '*', '@', '^', '~'};
         ArrayList<Character> list1 = new ArrayList<Character>();
         ArrayList<Character> list2 = new ArrayList<Character>();
         for(int i=0;i<N;i++)
         {
             list1.add(sc.next().charAt(0));
         }
         for(int j=0;j<N;j++)
         {
             list2.add(sc.next().charAt(0));
         }
         String out1 ="",out2 ="";
         for(char i : arr){
             if(list1.contains(i)) out1+=i+" ";
             if(list2.contains(i)) out2 += i +" ";
         }
         System.out.println(out1);
         System.out.println(out2);
     
	 }
     }
}