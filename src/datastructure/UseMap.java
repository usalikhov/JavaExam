package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
         */

        List<String> _cityOfRussia = new ArrayList<String>();
        List<String> _cityOfCanada = new ArrayList<String>();
        List<String> _cityOfChina = new ArrayList<String>();
        Map<String, List<String>> _map = new HashMap<String, List<String>>();

        _cityOfRussia.add("Moscow");
        _cityOfRussia.add("Ufa");
        _cityOfRussia.add("Piter");

        _cityOfCanada.add("Toronto");
        _cityOfCanada.add("Montreal");
        _cityOfCanada.add("vancouver");

        _cityOfChina.add("Beijing");
        _cityOfChina.add("Shanghai");
        _cityOfChina.add("Hong Kong");

        _map.put("Russia", _cityOfRussia);
        _map.put("Canada", _cityOfCanada);
        _map.put("China", _cityOfChina);

        for (Map.Entry<String, List<String>> n : _map.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());
        }

    }

}
