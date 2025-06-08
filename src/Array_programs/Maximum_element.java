package Array_programs;

public class Maximum_element {
    public static void main(String[] args) {
        int[] numbers = {203,7,56,89,34,56,33,44,56,67};
        int max= numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>max) max=numbers[i];

        }
        System.out.println(max);
    }
}
