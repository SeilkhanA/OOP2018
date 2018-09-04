import java.util.Scanner;

public class A0A2A4 {
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();

        int  ar [] = new int [n];
        for(int i = 0; i < n; ++i){
            ar[i] = num.nextInt();
        }

        for(int i = 0; i < n; ++i){
            if(i % 2 ==0){
                System.out.print(ar[i] + " ");
            }
        }


    }

}