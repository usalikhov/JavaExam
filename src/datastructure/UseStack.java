package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {
        /*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
         */
        Stack st = new Stack();

        for (int i = 0, m = 122; i < 123; i++, m++) {
            st.push(m);
        }

        Iterator it = st.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        
        st.remove(23);
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.pop());
        }
    }

}
