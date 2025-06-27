package Array_programs;

public class ReverseArray {

     public static void reversearray(int numbers[]){

         int first=0, last=numbers.length-1;
         while ((first<last)){
             //swap
             int temp=numbers[last];
             numbers[last]=numbers[first];
             numbers[first]=temp;
             first++;
             last--;
         }
     }
    public static void main(String[] args) {
        int[ ] numbers={34,56,32,43,56};

        reversearray(numbers);
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");

        }
        System.out.println();






        //eaiset way
//        for (int i = numbers.length-1; i >=0 ; i--) {
//            System.out.print(numbers[i]);

        }
    }

