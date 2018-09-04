import java.util.Scanner;

public class BinaryLog {
    public static void main (String[] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int k = 0;

        for(double i = 0; i < n; ++i){
            if(Math.pow(2,i) >= n){
                k++;
            }
            if(k==1){
                System.out.println((int)i);
            }
        }
    }
}
