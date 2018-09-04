import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);

        double a;
        double b;
        double c;

        a = num.nextInt();
        b = num.nextInt();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.print(c);
    }
}
