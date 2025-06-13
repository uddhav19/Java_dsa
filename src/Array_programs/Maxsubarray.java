package Array_programs;

public class Maxsubarray {

    public static void maxsubarraysum(int numbers[]){
        int currntsum=0;
        int maxsum= Integer.MIN_VALUE;
        for (int i = 0; i <numbers.length ; i++) {
            int start=i;
            for(int j=i;j<numbers.length; j++){
                int end=j;
                currntsum=0;
                for(int k = start; k<=end;k++){
                    //print subarray sum
                    currntsum+=numbers[k];

                }
                System.out.println(currntsum);
                if(maxsum<currntsum){
                    maxsum=currntsum;
                }

            }
            
        }
        System.out.println("maxsum = "+maxsum);
        

    }

    public static void main(String[] args) {

        int[] numbers= {2,4,6,8,10};
        maxsubarraysum(numbers);


    }
}
