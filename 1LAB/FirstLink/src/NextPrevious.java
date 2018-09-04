import java.util.Scanner;

public class NextPrevious {
    public static void main(String[] args){

        Scanner num = new Scanner (System.in);

        int a;

        a = num.nextInt();

        System.out.println("The next number for the number" + " " + a + " " + "is" +  " " + (a+1) + ".");
        System.out.println("The previous number for the number" + " " + a + " " + "is" +  " " + (a-1) + ".");
    }
}
