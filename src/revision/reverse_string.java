package revision;

public class reverse_string {
    public static void main(String[] args) {
        String a = "uddhav";

       /* String b="";
        for (int i = a.length()-1; i>=0; i--) {
            b=b+a.charAt(i);

        }
        System.out.println(b);


        if (b.equals(a)){
            System.out.println("string is palindrome");
        }else {
            System.out.println("not a palindrome");

        }*/

        //aproach 2
        StringBuffer sb= new StringBuffer();
        sb.append(a);

        sb.reverse();
        System.out.println(sb);




    }
}
