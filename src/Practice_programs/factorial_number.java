package Practice_programs;

public class factorial_number {
    public static int facto(int number) {
        int fac = 1;
        for (int i = 1; i <= number; i++) {
            fac = fac * i;
            //System.out.println(fac);


        }
        return fac;
    }
    public static void main(String[] args) {
        int number=5;

        System.out.println(facto(number));

    }
}
