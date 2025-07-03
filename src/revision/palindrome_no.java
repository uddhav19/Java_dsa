package revision;

public class palindrome_no {

    public static void main(String[] args) {
        int n = 1234321;
        int orgnum = n;

        int revnum = 0;

        while (n != 0) {
            revnum = revnum * 10 + n % 10;
            n = n / 10;


        }

        if (orgnum == revnum) {
            System.out.println("number is palindrome");

        } else {
            System.out.println("number is not palindrome");
        }
    }
}
