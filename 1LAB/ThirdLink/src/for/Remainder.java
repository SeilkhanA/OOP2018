import java.util.Scanner;

public class Remainder {
    public static void main(String[] args){

        Scanner num = new Scanner (System.in);

        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = num.nextInt();

        for(int i = a; i <= b; ++i)
        {
            if(i % d == c){
                System.out.println(i);
            }
        }

    }
}
