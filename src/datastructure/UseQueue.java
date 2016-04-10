package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
         */

        Queue list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        list.remove(4);

    }

}
