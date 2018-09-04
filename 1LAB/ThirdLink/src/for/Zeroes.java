import java.util.Scanner;

public class Zeroes {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n, m, k = 0;

        n = num.nextInt();

        for (int i = 1; i <= n; ++i) {
            m = num.nextInt();
            if ( m == 0 ) {
                k++;
            }


        }
        System.out.println(k);
    }
}

