import java.util.*;

class reverseStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            stack.push(sc.nextInt());
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(stack.pop());
        }
        
    }

}