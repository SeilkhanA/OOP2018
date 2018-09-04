import java.util.Scanner;

public class MinRemr {
    public static void main (String[] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();

        for(int i = 2; i <= n; ++i){
            if(n % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}