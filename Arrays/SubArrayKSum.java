import java.util.*;
import java.lang.*;
import java.io.*;

class SubArrayKSum {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    int N = sc.nextInt(),K = sc.nextInt();
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    for(int i=0;i<N;i++) list.add(sc.nextInt());
		    int left = 0,currSum = 0,right = 0;
		    int f = 0;
		    while(right<N)
		    {
		        if(currSum == K)
		        {
		            System.out.println((left+1)+" "+(right));
		            f = 1;
		            break;
		        }
		        else if(currSum < K)
		        {
		            currSum += list.get(right++);
		        }
		        else{
		            currSum -= list.get(left++);
                }
		    }
		    while(f == 0 && left < right )
		    {	        
		        if(currSum == K){
		            System.out.println((left+1)+" "+(right));
		            f = 1;
		            break;
                }
                currSum -= list.get(left++);
		    }
		    if (f == 0) System.out.println(-1);
		    
		}
	}
}