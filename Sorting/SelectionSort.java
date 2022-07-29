package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
//        int min;
//        int temp = 0;
//        int[] arr = {76,54,43,32,22,11};
//
//        for(int i = 0; i < arr.length; i++){
//                min =i;
//
//                    for(int j = i + 1; j < arr.length; j++){
//                                    if(arr[j] < arr[min]){
//                                       min = j;
//                                    }
//                        // swapping occur
//                        temp = arr[i];
//                        arr[i] = arr[min];
//                        arr[min] = temp;
//                    }
//        }
//        // for loop for showing sorted list
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        String[] arr = {"farooq","hasham","zulfi", "amir","kainat"};
//        String[] arr = {"deepak","rahul","ramesh","bhushan","amit"};
        int min;
        String temp = "";

        for(int i = 0; i < arr.length; i++){
            min = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
                // swapping occur
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        // for loop for showing sorted list
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
