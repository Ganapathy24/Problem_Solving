import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		    int k = 0;
		    for(int i=0;i<N;i++)
		    {
		        k ^= sc.nextInt();
		    }
		System.out.println(k);
		}
	}
}