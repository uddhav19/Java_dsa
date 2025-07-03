package revision;

public class reverse_no {
    public static void main(String[] args) {
        int n= 1234;
        int r = 0;
       /* while (n!= 0){

            r = r*10 + n%10;
            n=n/10;
            System.out.println(r);
        }*/

        //approach 2

        StringBuilder s= new StringBuilder();
        s.append(n);
          StringBuilder rev = s.reverse();
        System.out.println(rev);

    }
}
