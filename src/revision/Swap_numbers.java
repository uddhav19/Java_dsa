package revision;

public class Swap_numbers {
    public static void main(String[] args) {
        int a= 34;
        int b= 23;

        int temp;

        System.out.println("befor swapping  a="+a+"and b = "+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping  a="+a+"and b = "+b);
    }
}
