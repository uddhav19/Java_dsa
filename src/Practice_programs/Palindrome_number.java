package Practice_programs;

public class Palindrome_number {
    public static void main(String[] args) {
        int num = 23432;
        int originalNum = num;
        int rev= 0;
        while ((num!=0)){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println(rev);

        if (originalNum==rev){
            System.out.println("number is palindrome");
        }else {
            System.out.println("number is not palindrome");
        }

    }
}
