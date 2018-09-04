import java.util.Scanner;

public class F {
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int k = 0;

        int  ar [] = new int [n];

        for(int i = 0; i < n; ++i){
            ar[i] = num.nextInt();
        }

        for(int i = 1; i < n - 1; ++i){
            if(ar[i] > ar[i+1] && ar[i] > ar[i-1]){
                k++;

            }
        }
        System.out.print(k);
    }
}