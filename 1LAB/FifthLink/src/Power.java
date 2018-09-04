import java.util.Scanner;

public class Power {
    public static double power (double a, double n){

        double res = 1;
        return Math.pow(a,n);
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        double a = num.nextDouble();
        double n = num.nextDouble();

        double x = power(a,n);

        System.out.println((int)x);
    }
}