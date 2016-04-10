package algorithm;

public class Sort {

    long executionTime = 0;

    /*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
     */
    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int temp;
        for (int i = 0; i < (array.length - 1); i++) {
            for (int f = 0; f < array.length - i - 1; f++) {
                if (array[f] > array[f + 1]) /* For descending order use < */ {
                    temp = array[f];
                    array[f] = array[f + 1];
                    array[f + 1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }

    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int[] tempArray = new int[array.length];
        //implement here
        mergeSort(tempArray, 0, array.length - 1, array);
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }

    public void mergeSort(int[] tempArray, int lowerIndex, int upperIndex, int[] array) {
        if (lowerIndex == upperIndex) {
            return;
        } else {
            int mid = (lowerIndex + upperIndex) / 2;
            mergeSort(tempArray, lowerIndex, mid, array);
            mergeSort(tempArray, mid + 1, upperIndex, array);
            mergeForMergeSort(tempArray, lowerIndex, mid + 1, upperIndex, array);
        }
    }

    public void mergeForMergeSort(int[] tempArray, int lowerIndexCursor, int higerIndex, int upperIndex, int[] array) {
        int tempIndex = 0;
        int lowerIndex = lowerIndexCursor;
        int midIndex = higerIndex - 1;
        int totalItems = upperIndex - lowerIndex + 1;
        while (lowerIndex <= midIndex && higerIndex <= upperIndex) {
            if (array[lowerIndex] < array[higerIndex]) {
                tempArray[tempIndex++] = array[lowerIndex++];
            } else {
                tempArray[tempIndex++] = array[higerIndex++];
            }
        }

        while (lowerIndex <= midIndex) {
            tempArray[tempIndex++] = array[lowerIndex++];
        }

        while (higerIndex <= upperIndex) {
            tempArray[tempIndex++] = array[higerIndex++];
        }

        for (int i = 0; i < totalItems; i++) {
            array[lowerIndexCursor + i] = tempArray[i];
        }
    }

    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int left = 0;
        int right = array.length - 1;

        quickSort(left, right, array);
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }

    public void quickSort(int left, int right, int[] array) {
        if (left >= right) {
            return;
        }

        int pivot = array[right];
        int partition = partition(left, right, pivot, array);

        quickSort(0, partition - 1, array);
        quickSort(partition + 1, right, array);
    }

    public void swap(int left, int right, int[] array) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public int partition(int left, int right, int pivot, int[] array) {
        int leftCursor = left - 1;
        int rightCursor = right;
        while (leftCursor < rightCursor) {
            while (array[++leftCursor] < pivot);
            while (rightCursor > 0 && array[--rightCursor] > pivot);
            if (leftCursor >= rightCursor) {
                break;
            } else {
                swap(leftCursor, rightCursor, array);
            }
        }
        swap(leftCursor, right, array);
        return leftCursor;
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int n = array.length - 1;

        //implement here
        buildheap(array, n);
        for (int i = n; i > 0; i--) {
            exchange(0, i, array);
            n = n - 1;
            maxheap(array, 0);
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;

    }

    public static void buildheap(int[] array, int n) {
        for (int i = n / 2; i >= 0; i--) {
            maxheap(array, i);
        }
    }

    public static void maxheap(int[] array, int i) {
        int n = array.length - 1;
        int left = 2 * i;
        int right = 2 * i + 1;
        int largest;
        if (left <= n && array[left] > array[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right <= n && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            exchange(i, largest, array);
            maxheap(array, largest);
        }
    }

    public static void exchange(int i, int j, int[] array) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int maxVal = 1000000;
        //implement here

        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
