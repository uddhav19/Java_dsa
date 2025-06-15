package Patterns;

import java.util.Scanner;

public class First {

    public static int star1(int n){
        for (int i = 0; i < n; i++) {
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        return n;

    }

    public static int star2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        return n;

    }
    public static int star3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
        return n;

    }
   public static void star4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);

            }
            System.out.println();

        }

    }
    public static void star5(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
    public static void star6(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j);

            }
            System.out.println();

        }

    }
    public static void star7(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i+1; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <2*i-1; j++) {
                System.out.print("*");

            }
            for (int j = 0; j <n-i+1; j++) {
                System.out.print(" ");

            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter number");
//        int n= scanner.nextInt();
        star7(8);

    }
}
