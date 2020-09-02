import java.util.*;


class IntersectionPoint
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
    IntersectionPoint(int N)
    {
        this.N  =N;
        head  = null;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        IntersectionPoint list1 = new IntersectionPoint(N);
        IntersectionPoint list2 = new IntersectionPoint(N);

        for(int i = 0; i<N;i++)
        {
            int k = sc.nextInt();
            list1.insert(list1,k);
        }

        for(int i = 0; i<N;i++)
        {
            int k = sc.nextInt();
            list2.insert(list2,k);
        }
        int element = list1.intersectPoint(list1.head,list2.head);
        System.out.print(element+" ");
    
    }

    public void insert(IntersectionPoint obj,int item)
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
    int intersectPoint(Node headA, Node headB)
	{
         Node t1 = headA ,t2 = headB;
        while(t1 != null)
        {
            t1.data = t1.data * -1;
            if(t1.data == 0) t1.data = -999999;
            t1 = t1.next;
        }
        while(t2 != null && t2.data >= 0)
        {
            t2 = t2.next;
        }
        if(t2 == null) return -1;
        if(t2.data == -999999) return 0;
        return -1 * t2.data;
    }
    
}