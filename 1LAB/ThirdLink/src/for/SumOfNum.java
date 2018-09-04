import java.util.Scanner;

public class SumOfNum {
    public static void main (String [] args) {
        Scanner num = new Scanner(System.in);

        int a,b = 0,d;

        d = num.nextInt();

        for (int i = 1; i <= d; ++i) {
            a = num.nextInt();
            b = b + a;
        }
        System.out.println(b);
    }

}

