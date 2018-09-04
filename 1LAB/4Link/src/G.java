import java.util.Scanner;

public class G {
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int k = 0;

        int  ar [] = new int [n];

        for(int i = 0; i < n; ++i){
            ar[i] = num.nextInt();
        }

        for(int i = n-1; i >= 0; --i){
            System.out.print(ar[i] + " ");
            }
        }
    }
