import java.util.Scanner;

public class NumRem {
    public static void main (String [] args) {
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();

        for (int i = 1; i <= a; ++i) {
            if ( a % i == 0 ) {
                System.out.println(i);
                //break;
            }
        }
    }
}
