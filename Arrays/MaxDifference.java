
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int array[] = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        array[i] = sc.nextInt();
		    }
		    int mElement = array[N-1];
		    int maxDifference = 0;
		    for(int i=N-1;i>=0;i--)
		    {
		        if(array[i] < mElement)
		        {
		            maxDifference = Math.max(maxDifference,mElement - array[i]);
		        }
		        else{
		            mElement = array[i];
		        }
		    }
		    if(maxDifference == 0) System.out.println("-1");
		    else System.out.println(maxDifference);
		}
	}
}
}