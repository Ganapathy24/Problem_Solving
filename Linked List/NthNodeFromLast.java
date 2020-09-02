import java.util.*;


class NthNodeFromLast
{
    Node  head;
    int N;
    class Node{
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    NthNodeFromLast(int N)
    {
        this.N  =N;
        head  = null;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        NthNodeFromLast obj = new NthNodeFromLast(N);

        for(int i = 0; i<N;i++)
        {
            int k = sc.nextInt();
            obj.insert(obj,k);
        }
        int K = sc.nextInt();
        int result = obj.findNthelement(obj,K);
        System.out.print(result);

    }

    public void insert(NthNodeFromLast obj,int item)
    {
        if(obj.head == null)
        {
            obj.head = new Node(item);
        }
        else{
            Node temp = obj.head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new Node(item);
        }
    }
    public int findNthelement(NthNodeFromLast obj,int n)
    {
        Node front = obj.head,back = obj.head;
    	while(n-- > 0 && front!=null)
    	{
    	    front = front.next;
    	    if(n > 0 && front==null) return -1;
    	}
    	while(front!=null)
    	{
    	    back  = back.next;
    	    front = front.next;
    	}
    	return back.data;
    }
}