package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        /*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
         */

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.peek());

        for (int n : list) {
            System.out.println(n);
        }
        System.out.println(list.peekLast());

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        list.removeLast();
        System.out.println(list.getLast()+" after");
    }

}
