package math;

public class LowestNumber {

    public static void main(String[] args) {
        /*
		 * Write java solution to find the lowest number from this array.
         */
        int array[] = new int[]{110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        System.out.println(FindTheLowestNumber(array));
    }

    public static int FindTheLowestNumber(int[] array) {
        int result = array[0];
        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array.length; j++) {
                if(result > array[j]){
                    result = array[j];
                    break;
                }
            }
        }
        
        return result;
    }
}
