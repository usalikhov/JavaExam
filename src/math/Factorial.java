package math;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println(FactorialMethod(5));
    }
    // 1732MD_Uba
    public static int FactorialMethod(int num){
        
        if (num == 1) return num;
        return num * FactorialMethod(num - 1);
    }
    
}
