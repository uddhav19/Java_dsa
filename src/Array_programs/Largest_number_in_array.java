package Array_programs;

public class Largest_number_in_array {


    public static void main(String[] args) {

        int[] numbers = {203,7,56,89,34,56,33,44,56,67};
        System.out.println(largestelement(numbers));

    }
    private static int largestelement(int n[]){
        int largest= Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if(largest<n[i]){
                largest=n[i];
            }

        }
        return largest;
    }
}
