package Practice_programs;

public class reverse_number {
    public static void main(String[] args) {
        int num=12321;
        int rev=0;
        int orinum=num;
        while(num!=0){

            rev=rev*10 + num%10;
            num=num/10;
        }
        if (rev==orinum){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }



    }

