import java.util.*;

class MidElement
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
    MidElement(int N)
    {
        this.N  =N;
        head  = null;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        MidElement obj = new MidElement(N);
        for(int i = 0; i<N;i++)
        {
            int k = sc.nextInt();
            obj.insert(obj,k);
        }
        int mid = obj.getMiddle(obj.head);
        System.out.print(mid);
    
    }

    public void insert(MidElement obj,int item)
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
    int getMiddle(Node head)
    {
         Node fastptr = head,slowptr = head;
         while(fastptr != null)
         {
             fastptr = fastptr.next;
             if(fastptr != null)
             {
                 slowptr = slowptr.next;
                 fastptr = fastptr.next;
             }
         }
         return slowptr.data;
    }

}