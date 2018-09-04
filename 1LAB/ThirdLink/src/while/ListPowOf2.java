import java.util.Scanner;

public class ListPowOf2 {
    public static void main (String[] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int i = 1;

        while(i <= n){
            System.out.print(i + " ");
            i = i * 2;
        }
    }
}