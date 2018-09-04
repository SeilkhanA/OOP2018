import java.util.Scanner;

public class MKAD {
    public static void main (String[] args){

        Scanner num = new Scanner (System.in);

        int v,t,s;

        v = num.nextInt();
        t = num.nextInt();

        s = v * t % 109;

        System.out.print((s + 109) % 109);
    }
}
