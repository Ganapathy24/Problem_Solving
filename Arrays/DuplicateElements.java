import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> out = new ArrayList<Integer>();
        for(int i = 0;i<n;i++)
        {
            arr[arr[i]%n] += n;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] >= n*2)
            {
                out.add(i);
            }
        }
        if (out.size() == 0) out.add(-1);
        System.out.println(out);
    }
    
}