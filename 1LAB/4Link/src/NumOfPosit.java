import java.util.Scanner;

public class NumOfPosit {
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        int k = 0;
        int n = num.nextInt();

        int  ar [] = new int [n];

        for(int i = 0; i < n; ++i){
            ar[i] = num.nextInt();
        }

        for(int i = 0; i < n; ++i){
            if(ar[i] > 0){
                k++;
            }
        }
        System.out.print(k);
    }
}
