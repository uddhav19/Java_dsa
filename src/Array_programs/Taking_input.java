package Array_programs;

import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n= sc.nextInt();
        int [ ]  arr = new int[n];
        System.out.println("enter array elements");
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
