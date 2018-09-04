import java.util.Scanner;

public class E {
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int k = 0;

        int  ar [] = new int [n];

        for(int i = 0; i < n; ++i){
            ar[i] = num.nextInt();
        }

        boolean found = false;

        for(int i  = 0; i < n-1; ++i){
            if(ar[i] * ar[i+1] > 0){
                found = true;
                break;
            }
        }
        if(found)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}