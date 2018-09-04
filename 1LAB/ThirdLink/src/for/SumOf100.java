import java.util.Scanner;

public class SumOf100 {
    public static void main (String [] args) {
        Scanner num = new Scanner(System.in);

        int a,b = 0;

        for (int i = 1; i <= 100; ++i) {
            a = num.nextInt();
            b = b + a;
        }
        System.out.println(b);
    }

}
