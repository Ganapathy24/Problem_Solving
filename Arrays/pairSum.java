/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class pairSum {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- >0){
		    int N = sc.nextInt(),K = sc.nextInt();
		    
		    int[] list = new int[N];
		    for(int i=0;i<N;i++){
		        list[i] = sc.nextInt();
		    }
		    int f=0;
		    Arrays.sort(list);
		    int begin = 0 ,end = N-1;
		    while(begin < end){
		        int sum = list[begin] + list[end];
		        if(sum == K){
		            System.out.println("Yes");
		            f=1;
		            break;
		        }
		        else if(sum > K){
		            end--;
		        }
		        else{
		            begin++;
		        }
		    }
		    if (f==0)
		    System.out.println("No");
		}
	}
}