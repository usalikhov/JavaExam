package math;

import java.util.Random;

public class Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 * 
         */
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        ThePattern(array);
    }

    public static void ThePattern(int[] array) {
        int _temp = -1;
        int _erase = -1;

        //main loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                for (int f = 0; f < array.length; f++) {
                    if (_temp < array[f]) {
                        _temp = array[f];
                        _erase = f;
                    }
                }

                if (_erase >= 0) {
                    array[_erase] = -1;
                    _erase = -1;
                }

                System.out.print(_temp + ",");
                _temp = -1;
                i=0;
            }
        }

    }
}
