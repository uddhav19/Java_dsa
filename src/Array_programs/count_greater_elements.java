package Array_programs;
//count the number of elemnts of in the given array greater than given number x
public class count_greater_elements {
    public static void main(String[] args) {
        int[] numbers = {203,7,56,89,34,56,33,44,56,67};
        int x= 56;
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>x) count++;


        }
        System.out.println(count);
    }
}
