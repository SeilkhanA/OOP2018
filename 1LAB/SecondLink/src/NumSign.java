import java.util.Scanner;

public class NumSign {
    public static void main (String [] args){

        Scanner num = new Scanner (System.in);

        int a;

        a = num.nextInt();

        if(a>0){
            System.out.print(1);
        }
        else if (a<0){
            System.out.print(-1);
        }
        else if (a==0){
            System.out.print(0);
        }
    }
}
