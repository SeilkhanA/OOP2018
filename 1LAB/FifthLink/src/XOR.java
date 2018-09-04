import java.util.Scanner;

public class XOR {
    public static boolean Xor(int x, int y){
        boolean d = false;
        boolean s = true;

        if(x != y){
            if(s){
               // System.out.println(1);
            }
            return s;
        }
        else {
            //System.out.println(0);
            return d;
        }
    }


    public static void main(String[] args){

        Scanner num = new Scanner (System.in);

        int x = num.nextInt();
        int y = num.nextInt();

        System.out.println(Xor(x,y));
    }
}