import java.util.Scanner;

class Length{

    static class Node
    {
        char data;
        Node next;
    };
    static Node newNode(char data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;

        return temp;
    }
    static Node insert(Node head, char data)
    {
        if (head == null)
            return newNode(data);

        head.next = insert(head.next, data);
        return head;
    }
    static void printList (Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        return;
    }

    static void runLengthEncode (Node head)
    {
        Node temp;
        Node ptr;

        int count = 0;

        temp = head;
        while (temp != null)
        {
            ptr = temp;
            count = 1;
            while (temp.next != null &&
                    temp.data == temp.next.data)
            {
                count++;
                if (count > 2)
                {
                    ptr.next = temp.next;
                    temp= null;
                    temp = ptr;
                }
                temp = temp.next;
            }
            if (count > 1)
                temp.data = (char) (count + '0');
            temp = temp.next;
        }
        return;
    }
    public static void main(String [] args)
    {

        Scanner sc=new Scanner(System.in);
        Node head = newNode('1');
        head.next = newNode('3');
        head.next.next = newNode('2');
        head.next.next.next = newNode('5');

        runLengthEncode (head);
        printList (head);

    }

}
