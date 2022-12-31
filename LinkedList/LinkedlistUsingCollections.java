package LinkedList;

import java.util.*;

public class LinkedlistUsingCollections {
    public static void main(String args[]) {
        java.util.LinkedList <String> list = new java.util.LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        //System.out.println(list);

        list.addLast("list");
        //System.out.println(list);

        list.addFirst("This");
        //System.out.println(list);

        //System.out.println(list.size());
     
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
            
        }
        System.out.println("null");

        list.removeFirst();
        //System.out.println(list);

       // list.removeLast();
        //System.out.println(list);

        list.remove(1);
        //System.out.println(list);

    }
}
