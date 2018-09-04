import java.util.Scanner;

public class NumOfRem {
    public static void main (String [] args) {
        Scanner num = new Scanner(System.in);

        int k = 0;
        int a = num.nextInt();

        for (int i = 1; i <= a; ++i) {
            if ( a % i == 0 )
                k++;
                //break;
        }
        System.out.print(k);
    }
}
