package Array_programs;

public class Pairs_array {

    public static void Pairs_of_array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int curr= arr[i];
            for (int j=i+1; j< arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        int[] arr = {5,2,7,8,4};
        Pairs_of_array(arr);
    }
}
