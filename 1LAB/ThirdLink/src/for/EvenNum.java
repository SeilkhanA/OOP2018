import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args){

        Scanner  num = new Scanner (System.in);

        int a = num.nextInt();
        int b = num.nextInt();

        for(int i = a; i <= b; ++i)
        {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
