package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
         */
        ArrayList list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        list.remove(4);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }

}
