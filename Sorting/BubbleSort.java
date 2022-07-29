package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int temp = 0;
        int[] arr = {56,45,34,22,12,9};
        for(int i = 0; i < arr.length; i++){
            int flag = 0;
            for(int j = 0; j < arr.length - 1; j++){

                if(arr[j] >arr[j+1]){
                 // in this swapping occur
                 temp =  arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1]  =  temp;
                 flag = 1;
                }
            }
            // flaq variable used to fast the speed of the program
            if(flag == 0){

                break;
            }
        }

        for(int i = 0; i < arr.length; i++ )
            System.out.print(arr[i] + " ");

    }
}
//    if(arr[j].equals(arr[min])){