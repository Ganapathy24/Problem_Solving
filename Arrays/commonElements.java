import java.util.*;
import java.lang.*;
import java.io.*;
class commonElements
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         int N1 = sc.nextInt(),N2 = sc.nextInt(),N3 = sc.nextInt();
         ArrayList<Integer> list1 = new ArrayList<Integer>();
         ArrayList<Integer> list2 = new ArrayList<Integer>();
         ArrayList<Integer> list3 = new ArrayList<Integer>();
         for(int i=0;i<N1;i++) list1.add(sc.nextInt());
         for(int i=0;i<N2;i++) list2.add(sc.nextInt());
         for(int i=0;i<N3;i++) list3.add(sc.nextInt());
         HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
         for(int i:list1){
             map.put(i,1);
         }
         for(int j:list2){
             if(map.containsKey(j)){
                 map.put(j,2);
             }
         }
         boolean f = false;
         for(int k:list3)
         {
             if(map.containsKey(k) && map.get(k) == 2){
                 System.out.print(k+" ");
                 map.put(k,0);
                 f = true;
             }
         }
         if(f == false) System.out.print(-1);
         System.out.println("");
	 }
	 }
}