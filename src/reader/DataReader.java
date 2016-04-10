package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class DataReader {

    public static void main(String[] args) {
        /*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            String str;

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
