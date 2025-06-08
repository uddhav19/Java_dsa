package String;

public class reverse_string {
    public static void main(String[] args) {
        String a= "uvvu";

        String rev="";
        for (int i = a.length()-1; i>=0 ; i--) {
            rev+= a.charAt(i);

        }
        System.out.println(rev);
        if (rev.equals(a)){
            System.out.println("it is palindrome");

        }else {
            System.out.println("it is not palindrome");
        }
    }
}
