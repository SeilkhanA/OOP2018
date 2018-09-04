import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args){

        Scanner num = new Scanner(System.in);

        int n;

        n = num.nextInt();

        if(n % 4 == 0 && n % 100 != 0) {
            System.out.println("YES");
        }
        else if (n % 400 == 0) {
            System.out.println("YES");
        }

        else System.out.println("NO");
    }
}

