import java.util.Scanner;

public class WhichBigger {
     public static void main (String [] args){

         Scanner num = new Scanner (System.in);

         int a,b;

         a = num.nextInt();
         b = num.nextInt();

         if(a>b){
             System.out.print(1);
         }
         else if (b>a){
             System.out.print(2);
         }
         else if (a==b){
             System.out.print(0);
         }

     }
}