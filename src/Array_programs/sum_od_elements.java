package Array_programs;

import java.util.Scanner;

public class sum_od_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int sum=0;
        for (int i=0; i<n; i++ ){
            sum+= arr[i];
        }
        System.out.println("the sum of array is: "+ sum);
    }
}
