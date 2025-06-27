package String;

public class String_comresssion {
    public  static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }
            sb.append(ch).append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdd";
        System.out.println(compress(str));
    }
}
