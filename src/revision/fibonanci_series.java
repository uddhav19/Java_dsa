package revision;

public class fibonanci_series {
    public static void main(String[] args) {
        int n1 = 0, n2= 1, sum= 0;
        for (int i = 2; i <=20; i++) {
            sum = n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }

    }
}
