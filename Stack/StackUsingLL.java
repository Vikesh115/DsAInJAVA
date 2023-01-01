package Stack;
public class StackUsingLL{
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            // if linked list is empty then head of newNode 
            //become head of element
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            // if linked list not empty
            //1->2->3->Null
            //After add 4 then head of newNode means head of 4 
            //become head  
            //4->1->2->3->Null
            newNode.next = head;
            head = newNode;
        }
       public static int pop() {
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
       }

       public static int peak(){
        if(isEmpty())
        {
            return -1;
        }
        return head.data;
       }
    }

    public static void main(String args[]) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    while(!s.isEmpty())
    {
     System.out.println(s.peak());
     s.pop();
    }
    }
}
