import java.util.*;


class LinkedList
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
    LinkedList(int N)
    {
        this.N  =N;
        head  = null;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList obj = new LinkedList(N);

        for(int i = 0; i<N;i++)
        {
            int k = sc.nextInt();
            obj.insert(obj,k);
        }
        obj.PrintList(obj);
    
    }

    public void insert(LinkedList obj,int item)
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
    public void PrintList(LinkedList obj)
    {
        Node temp = obj.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}