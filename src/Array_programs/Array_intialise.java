package Array_programs;

public class Array_intialise {
    public static void main(String[] args) {
        int [] arr = {23,45,67,69,87,34};
//        for (int i=0; i<=5; i++){
//            System.out.println(arr[i]);//calling the i value
//        }
        System.out.println(arr.length);
        int n= arr.length;
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
