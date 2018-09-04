import java.util.Scanner;

public class TestingSystem {
    public static void main(String [] args){

        Scanner num = new Scanner(System.in);

        int a,b;

        a = num.nextInt();
        b = num.nextInt();
        if(a == b && b == a)
        {
            System.out.println("YES");
        }
        else if (a != 1 && b != 1)
        {
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}

