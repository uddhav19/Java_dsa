package Sorting;

public class Selection_sort {


    public static void selectionsort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos]>arr[j]){
                    minpos=j;
                }
                
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

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
        selectionsort(arr);
        printarr(arr);

    }
}
