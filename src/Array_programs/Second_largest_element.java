package Array_programs;

public class Second_largest_element {
    public static void main(String[] args) {
        int[] numbers = {203,7,56,89,34,56,33,44,56,67};
        int max= Integer.MIN_VALUE; //initialse minimum value
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>max) max=numbers[i];

        }
        int smax= Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>smax && numbers[i]!=max)
                smax =numbers[i];
            
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
