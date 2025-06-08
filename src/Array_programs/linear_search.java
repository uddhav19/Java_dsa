package Array_programs;

public class linear_search {
    public static void main(String[] args) {
        int[] numbers = {203,7,56,89,34,56,33,44,56,67};
        int key= 44;
        boolean flag= false;//nhi mila
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key){
                flag=true;
                break;
            }


        }
        if (flag == false) {

            System.out.println("key not found");
        }else {
            System.out.println("key found");
        }

    }
}
