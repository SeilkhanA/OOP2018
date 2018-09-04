import java.util.Scanner;

public class MinRem {
    public static void main (String [] args) {
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();

        for (int i = 2; i <= a; ++i) {
            if ( a % i == 0 ) {
                System.out.println(i);
                break;
            }
        }
    }
}

