import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        int[] arr = {4,5,2,4};
       arr =  sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public static int[] sort(int[] arr){
        int[] sortedArr = selectionSort(arr);
        return sortedArr;
    }
}
