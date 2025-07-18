package revision;

import java.util.Arrays;

public class smallest {
    public static void main(String[] args) {
        int[] numbers= {2,5,6,1,8};
        System.out.println(smallestelemnt(numbers));


    }

    static int smallestelemnt(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];

            }

        }
        return min;
    }
}
