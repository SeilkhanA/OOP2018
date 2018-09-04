import java.util.Scanner;

public class Apple2 {
    public static void main(String[] args){

        Scanner num = new Scanner (System.in);

        int n;
        int k;
        int c;

        n = num.nextInt();
        k = num.nextInt();

        c = k % n;

        System.out.print(c);
    }
}
