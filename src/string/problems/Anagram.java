package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        CheckIsAnagram("CAT", "ACT");
        CheckIsAnagram("SDF", "ASDFASD");
        CheckIsAnagram("HELLO", "WORLD");
        CheckIsAnagram("ARMY", "MARY");
        CheckIsAnagram("123123", "AC1T");

    }

    public static void CheckIsAnagram(String str1, String str2) {
        String mainStr1 = str1.replaceAll("\\s", "");
        String mainStr2 = str2.replaceAll("\\s", "");
        boolean status = true;

        if (mainStr1.length() != mainStr2.length()) {
            status = false;
        } else {
            char[] s1Array = mainStr1.toLowerCase().toCharArray();
            char[] s2Array = mainStr2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array, s2Array);
        }

        if (status) {
            System.out.println(str1 + " " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " " + str2 + " are NOT anagrams");
        }
    }

}
