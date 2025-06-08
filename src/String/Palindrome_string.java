package String;

import java.util.Scanner;

public class Palindrome_string {
    public static Boolean Palindromestring(String str){
        String rev="";
        for (int i = str.length()-1; i>=0; i--) {
            rev+=str.charAt(i);

        }

        return str.equals(rev);
    }

    public static void main (String[ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();

        if ( Palindromestring(str)){
            System.out.println("string is palindrome");
        }else {
            System.out.println("string is not palindrome");
        }

    }

}
