
import java.util.*;
import java.lang.*;
import java.io.*;

class majorityElement {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		    int list[] = new int[N+1];
		    for(int i=0;i<N;i++){
		        list[i] = sc.nextInt();
		    }
		    for(int i= 0;i<N;i++)
		    {
		        list[(list[i])%(N+1)]  += (N+1);
		    }
		    int f =0 ;
		    for(int i = 0;i<=N;i++){
		        int val = list[i]/(N+1);
		        if(val > N/2) {
		            f= 1;
		            System.out.println(i);
		            break;
		        }
		    }
		    if (f == 0) System.out.println(-1);  
		}
	}