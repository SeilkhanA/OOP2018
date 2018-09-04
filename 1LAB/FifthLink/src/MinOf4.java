import java.util.Scanner;

public class MinOf4 {
        public static int minimal(int a, int b, int c, int d){
            return Math.min(Math.min(a,b), Math.min(c,d));
        }

        public static void main(String[] args){

            Scanner num = new Scanner (System.in);

            int a,b,c,d;

            a = num.nextInt();
            b = num.nextInt();
            c = num.nextInt();
            d = num.nextInt();

            int x = minimal(a,b,c,d);

            System.out.println(x);
        }
    }