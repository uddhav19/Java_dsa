package Practice_programs;

public class increase_number_pyramid {
    public static void main(String[] args) {
    int n=20;
        for (int i = 1; i <=n ; i++) {
            if(i>=6 && i<=11 || i>=15 && i<=20) {
                System.out.print("* ");
            }else {
                System.out.print(i);
            }

        }
    }

}
