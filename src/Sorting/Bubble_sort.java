package Sorting;

public class Bubble_sort {

    public static void Bubblesort(int[] arr){
        for (int turn =0; turn<arr.length-1; turn++){
            for (int j=0; j<arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public static void printarr(int[ ] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);


        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,2,7,8,4};
        //Arrays.sort(arr); direct sorting of array



        Bubblesort(arr);
        printarr(arr);




    }
}
