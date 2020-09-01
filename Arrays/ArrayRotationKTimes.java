import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayRotationKTimes {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0){
		    int N =sc.nextInt(),k = sc.nextInt();
		    List<Integer> list = new ArrayList<>();
		    for(int i=0;i<N;i++)
		    {
		        list.add(sc.nextInt());
		    }
		    Collections.rotate(list,-k);
		    for(int l :list){
		        System.out.print(l+" ");
		    }
		    System.out.println("");
		    
		}
	}
}