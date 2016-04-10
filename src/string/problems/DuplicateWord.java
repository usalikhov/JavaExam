package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        //The average
        String[] _allWords = st.split(" ");
        int _totalChars = 0;
        int _sizeOfWords = _allWords.length;

        for (String _word : _allWords) {
            _totalChars += _word.length();
        }
        System.out.println(_totalChars / _sizeOfWords);

        //duplicate words
        Map<String, Integer> _occurrences = new HashMap<String, Integer>();

        for (String _word : _allWords) {
            Integer count = _occurrences.get(_word);
            if (count == null) {
                count = 0;
            }
            _occurrences.put(_word, count+1);
        }

        for (Map.Entry<String, Integer> n : _occurrences.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());
        }
    }

}
