package math;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
         */
        for (int i = 2; i < 1000000; i++) {
            if(PrimeNumbers(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean PrimeNumbers(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
