package algorithm;

import java.util.Random;

public class Numbers {

    /*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
     */
    public static void main(String[] args) {

        int[] num = new int[10000];

        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {

            num[i] = rand.nextInt(1000000);

        }

        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

        //Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

        //bubbleSort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bubbleSortExecutionTime + " milli sec");

        //MergeSort
        algo.mergeSort(num);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + mergeSortExecutionTime + " milli sec");

        //QuickSort
        algo.quickSort(num);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + quickSortExecutionTime + " milli sec");

        //heapSort
        algo.heapSort(num);
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + heapSortExecutionTime + " milli sec");

         //bucketSort
        algo.bucketSort(num);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bucketSortExecutionTime + " milli sec");

        //shellSort
        algo.shellSort(num);
        long shellSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + shellSortExecutionTime + " milli sec");

    }

}
