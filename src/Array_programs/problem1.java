package Array_programs;

import java.util.Scanner;

public class problem1 {
    //Given an array of marks of students if the mark of any student is less than 35 print its roll no.
    //[roll no here refers to the index of the array]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
      int n= sc.nextInt();
        int [] marks = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            marks[i]= sc.nextInt();

        }
        for (int i = 0; i <marks.length; i++) {
            if(marks[i]<35){
                System.out.println(i);
            }

        }



    }
}
