package Sorting;

public class QuickSort {
    public static void main(String[] args) {

//        int[] arr = {15, 9, 7, 12, 12, 16,4,18,11};
        int[] arr = {54, 43, 32, 21, 20, 11};
        int length = arr.length;
        QuickSort qs = new QuickSort();
        qs.QuickSortRecursion(arr, 0, length - 1);
        qs.printArray(arr);
    }

    int partition(int[] arr, int low, int high) {

        int pivot = arr[(low + high) / 2];
        while (low <= high) {

            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {

                // swapping occur
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    void QuickSortRecursion(int[] arr, int low, int high) {

        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            QuickSortRecursion(arr, low, pi - 1);
        }
        if (pi < high) {
            QuickSortRecursion(arr, pi, high);
        }

    }

    void printArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
