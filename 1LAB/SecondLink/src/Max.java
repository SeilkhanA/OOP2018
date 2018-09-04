import java.util.Scanner;

public class Max {
    public static void main (String [] args){

        Scanner num = new Scanner (System.in);

        int a,b;

        a = num.nextInt();
        b = num.nextInt();

        if (a>b){
            System.out.println(a);
        }
        else
            System.out.println(b);
    }
}
