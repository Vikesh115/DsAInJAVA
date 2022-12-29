// Singular LL
package LinkedList;

public class Operations {
    Node head;
    private int size;

    Operations() {
        this.size = 0;

    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add - Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        if (head.next == null) // if we have only one element
        {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
    
    // Reverse Iterative
    public void reverseIterate() {
        // corner case
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nexNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nexNode;
        }
        head.next = null;
        head = prevNode;
    }
    
    // Reverse Recursive
    public Node reverseRecursive(Node head) {
       if(head == null || head.next == null)
       {
        return head;
       } 
       Node newHead = reverseRecursive(head.next);
       head.next.next = head;
       head.next = null;
       return newHead; 
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            ;
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "=>");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        Operations list = new Operations();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
