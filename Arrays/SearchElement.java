import java.util.*;
import java.lang.*;
import java.io.*;
class SearchElement {
    
}
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while(T-- > 0){
         int N = sc.nextInt();
         int arr[] = new int[N];
         for(int i=0;i<N;i++)
         {
            arr[i] = sc.nextInt();
         }
         int  key = sc.nextInt();
         int ans = BinarySearch(arr,0,N-1,key);
         System.out.println(ans);
     }
	 }
	 public static int BinarySearch(int arr[],int start,int end,int k)
	 {
	     int ans = -1;
	     if(start <= end){
	         if(arr[start] <= arr[end] ){
	             if(arr[start] > k || arr[end] < k)
	             {
	                 return -1;
	             }
	             int mid = (start + end)/2;
	             if(arr[mid] == k)
	             {
	                 return mid;
	             }
	             else if(arr[mid] > k)
	             {
	                 return BinarySearch(arr,start,mid-1,k);
	             }
	             else{
	                 return BinarySearch(arr,mid+1,end,k);
	             }
	         }
	         else{
	             int mid = (start + end)/2;
	             if(arr[mid] == k) return mid;
	             ans = BinarySearch(arr,start,mid-1,k);
	             if(ans == -1) ans = BinarySearch(arr,mid+1,end,k);
	         }
	     }
	     return ans;
	 }
}